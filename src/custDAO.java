import java.sql.*;
import java.util.List;
import java.sql.PreparedStatement;

public class custDAO implements customerDAOInter {

    custDAO(){try {

        Connection con = custDatabase.getDBConnection();

    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }        }

    @Override
    public customer get(int id) throws SQLException {
        /*
        Connecion c = custDatabase.getDBConnection();
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


         */
        return null;

    }
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
}
