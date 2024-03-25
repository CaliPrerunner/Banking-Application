import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class accountDAO implements accountDAOI{

    Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    String url = databaseConnection.getURL();
    String username = databaseConnection.getURL();
    String pwd = databaseConnection.getURL();
    accountDAO(){
        try {
            connection = databaseConnection.getDBConnection();

        } catch (SQLException se) {
            System.out.println(se.getMessage());}
    }
    @Override
    public account get(int id) throws SQLException {

        //this is the SQL command that specifiying what data is is selecting and from which table it is coming from by the FROM command. WHERE points to the key that identifies the row in the SQL database
        String sql = "SELECT custID, balance, date_created FROM account WHERE custID = ?";

        pStatement = connection.prepareStatement(sql);
        pStatement.setInt(1,id);
        result = pStatement.executeQuery();

        account updatedEmp = null;
        if (result.next()) {
            account e = new account();
            //the names in the parentesis corresponds to the names of the columns in the SQL database
            //mysql looks for these columns in the parethesis
            updatedEmp = new account( result.getDouble("balance"),
                    result.getDate("date_created").toLocalDate(),
                    result.getInt("custID"));
        }

        return updatedEmp;

    }

    @Override
    public List<account> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(account e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(account e) throws SQLException {
        return 0;
    }

    @Override
    public int update(account e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(account e) throws SQLException {
        return 0;
    }
}
