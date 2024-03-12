import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class transactionsDAO implements transactionsDAOInter {
    static String url = tranactionsDataBase.getURL();
    static String username = tranactionsDataBase.getURL();
    static String pwd = tranactionsDataBase.getURL();

    transactionsDAO(){try {

        Connection con = custDatabase.getDBConnection();

    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }        }
    @Override
    public transactions get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<transactions> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(transactions e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(transactions e) throws SQLException {
        return 0;
    }

    @Override
    public int update(transactions e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(transactions e) throws SQLException {
        return 0;
    }
}
