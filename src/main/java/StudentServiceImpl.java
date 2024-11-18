import Service.CommonService;
import Service.StudentService;
import db.DataBaseConnection;
import model.entity.Student;
import model.enums.Major;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements CommonService<Student>, StudentService {

    @Override
    public List<Student> getByName(String name) throws SQLException {
        return List.of();
    }

    @Override
    public List<Student> getByMajor(String major) throws SQLException {
        return List.of();
    }

    @Override
    public List<Student> getByGpaBound(Double lowerGpa, Double higherGpa) throws SQLException {
        return List.of();
    }

    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        String query = "select * from student";

        try (PreparedStatement preparedStatement = DataBaseConnection.createPreparedStatement(query);
             ResultSet rs = DataBaseConnection.executeQuery(preparedStatement)) {

            while (rs.next()) {
                Student student = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        Major.valueOf(rs.getString(5))
                        rs.getDouble(6))
                studentList.add(student);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Database is empty");
        }

        return studentList
    }

    @Override
    public Student getById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public Student create(Student element) throws SQLException {
        return null;
    }

    @Override
    public Student deleteById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public Student updateById(Integer id, Student element) throws SQLException {
        return null;
    }
}
