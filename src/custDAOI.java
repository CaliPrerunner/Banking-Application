import java.sql.SQLException;

public interface custDAOI extends DAOInterface<customer>{
    public customer get(int id) throws SQLException;
}
