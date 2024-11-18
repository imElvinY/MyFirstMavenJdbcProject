package Service;

import java.sql.SQLException;
import java.util.List;

public interface CommonService <T> {
    List<T> getAll() throws SQLException;

    T getById(Integer id) throws SQLException;

    T create (T element) throws SQLException;

    T deleteById (Integer id) throws SQLException;

    T updateById (Integer id, T element) throws SQLException;


}
