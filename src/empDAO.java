import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empDAO implements empDAOI{
    Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    String url = empDatabaseConnection.getURL();
    String username = empDatabaseConnection.getURL();
    String pwd = empDatabaseConnection.getURL();
    empDAO(){
        try {
            connection = empDatabaseConnection.getDBConnection();

        } catch (SQLException se) {
            System.out.println(se.getMessage());}
    }
    @Override
    public employee get(int id) throws SQLException {
        pStatement = connection.prepareStatement(empDatabaseConnection.getSelect());
        pStatement.setInt(1,id);
        result = pStatement.executeQuery();

        employee updatedEmp = null;
        if (result.next()) {
            employee e = new employee();
            //the names in the parentesis corresponds to the names of the columns in the SQL database
            //mysql looks for these columns in the parethesis
            updatedEmp = new employee( result.getInt("employeeID"),
                    result.getString("first_name"), result.getString("last_name"),result.getString("bday"), result.getString("email"),
                    result.getString("department"), result.getString("user"),result.getString("password"), result.getString("phone"),
                    result.getString("gender"), result.getDouble("salary"));
        }

        return updatedEmp;
    }

    @Override
    public PQLL<employee> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(employee e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(employee e) throws SQLException {
        return 0;
    }

    @Override
    public int update(employee e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(employee e) throws SQLException {
        return 0;
    }
}
