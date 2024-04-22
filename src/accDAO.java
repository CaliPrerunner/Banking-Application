import java.sql.Connection;
import java.sql.SQLException;

public class accDAO implements DAOInterface<bankAccount> {

    static String url = accDatabase.getURL();
    static String username = accDatabase.getURL();
    static String pwd = accDatabase.getURL();
    accDAO(){try {

        Connection con = custDatabaseConnection.getDBConnection();

    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }        }


    @Override
    public bankAccount get(int id) throws SQLException {
        return null;
    }

    @Override
    public PQLL getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(bankAccount e) throws SQLException {
        return 0;
    }

    @Override
    public int insert(bankAccount e) throws SQLException {
        return 0;
    }

    @Override
    public int update(bankAccount e) throws SQLException {
        return 0;
    }

    @Override
    public int delete(bankAccount e) throws SQLException {
        return 0;
    }
}
