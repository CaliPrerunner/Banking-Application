import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class transactionsDAO implements transactionDAOInter{
    static String url = tranactionDataBase.getURL();
    static String username = tranactionDataBase.getURL();
    static String pwd = tranactionDataBase.getURL();

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
