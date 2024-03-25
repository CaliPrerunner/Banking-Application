import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.sql.PreparedStatement;

public class custDAO implements custDAOI {


      Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
     String url = databaseConnection.getURL();
     String username = databaseConnection.getURL();
     String pwd = databaseConnection.getURL();


    custDAO(){
        try {
        connection = databaseConnection.getDBConnection();

    } catch (SQLException se) {
        System.out.println(se.getMessage());}
    }

    @Override
    public customer get(int id) throws SQLException {

        //this is the SQL command that specifiying what data is is selecting and from which table it is coming from by the FROM command. WHERE points to the key that identifies the row in the SQL databse
        String sql = "SELECT customerID, first_name, last_name, ssn,userName,passworrd, phone, bday, gender,dateCreated, address FROM customers WHERE customerID = ?";
        //pStatement = connection.prepareStatement(databaseConnection.getSelect());

        pStatement = connection.prepareStatement(sql);
        pStatement.setInt(1,id);
        result = pStatement.executeQuery();

        customer updatedEmp = null;
        if (result.next()) {
            customer e = new customer();
            updatedEmp = new customer( result.getInt("customerID"),
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
    public List<customer> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int update(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(customer e) throws SQLException {
        return 0;
    }


        /*
        Connection c = custDatabase.getDBConnection();
        customer cust = null;
        String fname="";
        String lname="";
        int idd=0;
        custPQLL acc = null;
        String sql = getSelect();

        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet result = ps.executeQuery();

        if(result.next()){
             idd = result.getInt("customerID");
             acc = result.getObject(1,custPQLL);
             fname = result.getString("firstName");
             lname = result.getString("lastName");
        }

         cust.setFirstName(fname);
        cust.setCustID(idd);
        cust.setLastName(lname);
        cust.setAccList(acc);
        return cust;


        return null;
         @Override
    public List<customer> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int update(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(customer e) throws SQLException {
        return 0;
    }
  */
    }


    /*
    public static String getInsert() {

        return INSERT_SQL;
    }

    public static String getUpdate() {

        return UPDATE_SQL;
    }

    public static String getSelect() {

        return SELECT_SQL_BYID;
    }

    public static String getDelete() {

        return DELETE_SQL;
    }

    public static String getURL() {

        return URL;
    }

    public static String getUsername() {

        return USERNAME;
    }

    public static String getPWD() {

        return PASSWORD;
    }

    @Override
    public List<customer> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int update(customer e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(customer e) throws SQLException {
        return 0;
    }

     */

