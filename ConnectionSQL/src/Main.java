import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");

//        while (resultSet.next()) {
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDate(4) + " " + resultSet.getInt(5));
//        }

        int count = 0;
        while (resultSet.next() && count < 3) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDate(4) + " " + resultSet.getInt(5));
            count++;
        }

    }
}