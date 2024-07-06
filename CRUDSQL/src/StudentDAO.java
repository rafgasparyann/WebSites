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

    public void sort(List<Student> students) {
        boolean swap;
        for (int i = 0; i < students.size() - 1; i++) {
            swap = false;
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public void printStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getStid() + "    " + studentList.get(i).getName() + "    " + studentList.get(i).getSurname() + "    " + studentList.get(i).getDate() + "    " + studentList.get(i).getPay());
        }
    }

    public void read() throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        ResultSet rs = statement.executeQuery("select * from student");
        while (rs.next()) {
            System.out.println(rs.getInt("stid") + " " + rs.getString("name") + " " + rs.getString("surname") + " " + rs.getDate("date") + " " + rs.getInt("pay"));
        }
    }

    public void delete(String name, String surname, int pay) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        statement.executeUpdate("delete from student where name='" + name + "' and surname='" + surname + "' and pay=" + pay);
    }

    public void update(String name, int stid) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        statement.executeUpdate("update student set name='" + name + "' where stid=" + stid);
    }

    public void search(String name) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        ResultSet rs = statement.executeQuery("select * from student where name='" + name + "'");
        while (rs.next()) {
            System.out.println(rs.getInt("stid") + " " + rs.getString("name") + " " + rs.getString("surname") + " " + rs.getDate("date") + " " + rs.getInt("pay"));
        }
    }

    public void insert(String name, String surname, LocalDate date, int pay) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        statement.executeUpdate("insert into student values (null, '" + name + "', '" + surname + "', '" + date.toString() + "', " + pay + ")");
    }

    public void create(Student student) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        String name = student.getName();
        String surname = student.getSurname();
        LocalDate date = student.getDate();
        int pay = student.getPay();
        String str = "insert into student (name, surname, date, pay) values ('" + name + "', '" + surname + "', '" + date + "', '" + pay + "')";
        statement.executeUpdate(str, Statement.RETURN_GENERATED_KEYS);
        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next()) {
            student.setStid(generatedKeys.getInt(1));
        }
        System.out.println("Create has been successful");
    }

}