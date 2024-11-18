package Service;

import model.entity.Teacher;

import java.sql.SQLException;
import java.util.List;

public interface TeacherService extends CommonService<Teacher> {

    List<Teacher> getBySubject (String subject) throws SQLException;

    List<Teacher> getSalaryBound (Double salary) throws SQLException;


}
