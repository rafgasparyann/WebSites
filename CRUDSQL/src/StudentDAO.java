import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class StudentDAO {
    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void fillStudent() throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        ResultSet resultSet3 = statement.executeQuery("select * from student");
        while (resultSet3.next()) {
            int id = resultSet3.getInt("stid");
            String name = resultSet3.getString("name");
            String surname = resultSet3.getString("surname");
            LocalDate date = resultSet3.getDate("date").toLocalDate();
            int pay = resultSet3.getInt("pay");
            Student student = new Student(id, name, surname, date, pay);
            studentList.add(student);

        }
    }

    public void printStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getStid() + "    " + studentList.get(i).getName() + "    " + studentList.get(i).getSurname() + "    " + studentList.get(i).getDate() + "    " + studentList.get(i).getPay());
        }
    }
}

