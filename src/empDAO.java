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

        account updatedEmp = null;
        if (result.next()) {
            account e = new account();
            //the names in the parentesis corresponds to the names of the columns in the SQL database
            //mysql looks for these columns in the parethesis
            updatedEmp = new employee( result.getDouble("balance"),
                    result.getDate("date_created").toLocalDate(),
                    result.getInt("custID"));
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
