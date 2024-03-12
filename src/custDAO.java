import java.sql.*;
import java.util.List;
import java.sql.PreparedStatement;

public class custDAO implements customerDAOInter {


    @Override
    public customer get(int id) throws SQLException {
        Connecion c = SQLDatabase.getDBConnection();
        customer cust = null;
        String fname="";
        String lname="";
        int idd=0;
        custPQLL acc = null;
        String sql = "SELECT customerID, accounts, firstName, lastName WHERE id = ?";

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
