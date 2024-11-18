package Service;

import model.entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService extends CommonService<Student> {

    List<Student> getByName(String name) throws SQLException;

    List<Student> getByMajor(String major) throws SQLException;

    List<Student> getByGpaBound (Double lowerGpa, Double higherGpa) throws SQLException;
}
