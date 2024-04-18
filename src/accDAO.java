import java.sql.Connection;
import java.sql.SQLException;

public class accDAO implements DAOInterface<savingsAccount> {

    static String url = accDatabase.getURL();
    static String username = accDatabase.getURL();
    static String pwd = accDatabase.getURL();
    accDAO(){try {

        Connection con = custDatabaseConnection.getDBConnection();

    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }        }


    @Override
    public savingsAccount get(int id) throws SQLException {
        return null;
    }

    @Override
    public PQLL<savingsAccount> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(savingsAccount e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(savingsAccount e) throws SQLException {
        return 0;
    }

    @Override
    public int update(savingsAccount e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(savingsAccount e) throws SQLException {
        return 0;
    }
}
