import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class accDAO implements accDAOInter {

    static String url = accDatabase.getURL();
    static String username = accDatabase.getURL();
    static String pwd = accDatabase.getURL();
    accDAO(){try {

        Connection con = custDatabase.getDBConnection();

    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }        }


    @Override
    public account get(int id) throws SQLException {
        return null;
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
