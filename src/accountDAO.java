import java.sql.*;
import java.time.LocalDate;

public class accountDAO implements accountDAOI{

    Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    String url = custDatabaseConnection.getURL();
    String username = custDatabaseConnection.getURL();
    String pwd = custDatabaseConnection.getURL();
    accountDAO(){
        try {
            connection = custDatabaseConnection.getDBConnection();

        } catch (SQLException se) {
            System.out.println(se.getMessage());}
    }
    @Override
    public savingsAccount get(int id) throws SQLException {


        pStatement = connection.prepareStatement(accountDatabaseConnection.getSelect());
        pStatement.setInt(1,id);
        result = pStatement.executeQuery();

        savingsAccount updatedEmp = null;
        if (result.next()) {
            savingsAccount e = new savingsAccount();
            //the names in the parentesis corresponds to the names of the columns in the SQL database
            //mysql looks for these columns in the parethesis
            updatedEmp = new savingsAccount( result.getDouble("balance"),
                    result.getDate("date_created").toLocalDate(),
                    result.getInt("custID"));
        }

        return updatedEmp;

    }

    //tienes que connectar el public key del customer con el public key del accoututns
    @Override
    public PQLL<savingsAccount> getAll() throws SQLException {

        PQLL<savingsAccount> set = new PQLL<>();
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(accountDatabaseConnection.getListallSql());
        customer c = new customer();
        c.createList();

        while(result.next()){
            int id = result.getInt("custID");
            double ball=   result.getDouble("balance");
            LocalDate date=  result.getDate("date_created").toLocalDate();
            c.createBankAccount(date,ball,id);
        }
        int cp = 1;
        return c.getAccounts();

    }

    @Override
    public int save(savingsAccount e) throws SQLException {
        return 0;
    }

    // return 1 = sucess return 0=nothing changed
    @Override
    public int insert(savingsAccount e) throws SQLException {
        int res = -1;
        pStatement = connection.prepareStatement(accountDatabaseConnection.getInsert());
        pStatement.setInt(1, e.getCustomerID());
        pStatement.setDouble(2, e.getBalance());
        pStatement.setDate(3, Date.valueOf(e.getDateCreated()));

        res = pStatement.executeUpdate();

        return res;
    }

    //no se pq estaba sin funcionando creo q es por el ai pk set up
    @Override
    public int update(savingsAccount e) throws SQLException {

        int result = -1;

        pStatement = connection.prepareStatement(accountDatabaseConnection.getUpdate());
        pStatement.setInt(1, e.getCustomerID());
        pStatement.setDouble(2, e.getBalance());
        pStatement.setDate(3, Date.valueOf(e.getDateCreated()));
//algo raro pq no hay 12 indice en la tabla de SQL
        pStatement.setInt(4,0);
        result = pStatement.executeUpdate();

        return result;

    }

    @Override
    public int delete(savingsAccount e) throws SQLException {
        int res = -1;

        pStatement = connection.prepareStatement(accountDatabaseConnection.getDelete());
        pStatement.setInt(1,e.getCustomerID());
        res = pStatement.executeUpdate();

        return res;

    }
}
