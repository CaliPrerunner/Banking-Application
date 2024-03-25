import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import java.sql.PreparedStatement;

public class custDAO implements custDAOI {


    Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    String url = custDatabaseConnection.getURL();
    String username = custDatabaseConnection.getURL();
    String pwd = custDatabaseConnection.getURL();


    custDAO() {
        try {
            connection = custDatabaseConnection.getDBConnection();

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    @Override
    public customer get(int id) throws SQLException {

        //this is the SQL command that specifiying what data is is selecting and from which table it is coming from by the FROM command. WHERE points to the key that identifies the row in the SQL databse
        String sql = "SELECT customerID, first_name, last_name, ssn,userName,passworrd, phone, bday, gender,dateCreated, address FROM customers WHERE customerID = ?";
        //pStatement = connection.prepareStatement(databaseConnection.getSelect());

        pStatement = connection.prepareStatement(custDatabaseConnection.getSelect());
        pStatement.setInt(1, id);
        result = pStatement.executeQuery();

        customer updatedEmp = null;
        if (result.next()) {
            customer e = new customer();
            updatedEmp = new customer(result.getInt("customerID"),
                    result.getString("first_name"),
                    result.getString("last_name"),
                    result.getString("ssn"),
                    result.getString("userName"),
                    result.getString("passworrd"),
                    result.getString("phone"),
                    result.getString("bday"),
                    result.getString("gender"),
                    result.getDate("dateCreated").toLocalDate(),
                    result.getString("address"));
        }

        return updatedEmp;

    }

    @Override
    public PQLL<customer> getAll() throws SQLException {

        PQLL<customer> set = new PQLL<>();
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(custDatabaseConnection.getListallSql());

        while(result.next()){
           int id = result.getInt("customerID");
                 String fn=   result.getString("first_name");
                   String ln = result.getString("last_name");
            String ssn= result.getString("ssn");
            String usr= result.getString("userName");
            String pass= result.getString("passworrd");
            String phone =result.getString("phone");
            String bday= result.getString("bday");
            String gender= result.getString("gender");
           LocalDate date=  result.getDate("dateCreated").toLocalDate();
            String addy=    result.getString("address");
            customer c = new customer(id,fn,ln,ssn,usr, pass,phone,bday,gender,date,addy);
            set.enqueue(c,c.compareAccounts(date));
        }
        return set;
    }

    //I think this method is just another type of constructor for customers, one that does
    // not inlcude all the values for creatring the customer
    @Override
    public int save(customer e) throws SQLException {

        /*
        int res = -1;
        pStatement = connection.prepareStatement(custDatabaseConnection.getInsert());
        pStatement.setString(1, e.getUsername());
        pStatement.setString(2, e.getEmail());
        pStatement.setInt(3, emp.getID());
        res = pStatement.executeUpdate();

        return res;
         */
return 0;
    }

    @Override
    public int insert(customer e) throws SQLException {
        int res = -1;
        pStatement = connection.prepareStatement(custDatabaseConnection.getInsert());
        //222,"Luke", "dury","000-00-0000","lukeD","none","415-293-2933","1999-05-12","male", LocalDate.now(),"the Marina")
        pStatement.setInt(1, e.getCustomerID());
        pStatement.setString(2, e.getFirstName());
        pStatement.setString(3, e.getLastName());
        pStatement.setString(4, e.getSSN());
        pStatement.setString(5, e.getUserName());
        pStatement.setString(6, e.getPassword());
        pStatement.setString(7, e.getPhone());
        pStatement.setString(8, e.getBirthday());
        pStatement.setString(9, e.getGender());
        pStatement.setDate(10, Date.valueOf(e.getDateCreated()));
                pStatement.setString(11, e.getAddy());

        res = pStatement.executeUpdate();
        //custDatabaseConnection.closePreparedStatment(pStatement);

        return res;
    }

    @Override
    public int update(customer e) throws SQLException {

        int result = -1;

        pStatement = connection.prepareStatement(custDatabaseConnection.getUpdate());
        pStatement.setInt(1, e.getCustomerID());
        pStatement.setString(2, e.getFirstName());
        pStatement.setString(3, e.getLastName());
        pStatement.setString(4, e.getSSN());
        pStatement.setString(5, e.getUserName());
        pStatement.setString(6, e.getPassword());
        pStatement.setString(7, e.getPhone());
        pStatement.setString(8, e.getBirthday());
        pStatement.setString(9, e.getGender());
        pStatement.setDate(10, Date.valueOf(e.getDateCreated()));
        pStatement.setString(11, e.getAddy());
        //algo raro pq no hay 12 indice en la tabla de SQL
        pStatement.setInt(12,0);
        result = pStatement.executeUpdate();

        return result;
    }

    @Override
    public int delete(customer e) throws SQLException {
        int res = -1;

        pStatement = connection.prepareStatement(custDatabaseConnection.getDelete());
        pStatement.setInt(1,e.getCustomerID());
        res = pStatement.executeUpdate();

        return res;
    }

}

