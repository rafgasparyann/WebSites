import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");
        Statement statement = connection.createStatement();

//        ResultSet resultSet = statement.executeQuery("select * from student");
//        while (resultSet.next()) {
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDate(4) + " " + resultSet.getInt(5));
//        }

//        int count = 0;
//        while (resultSet.next() && count < 3) {
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDate(4) + " " + resultSet.getInt(5));
//            count++;
//        }

//        while (resultSet.next()) {
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString("name"));
//        }
//
//        ************************************************************************************
//
//        Drop table -------------------------------------------------------------------------
//
//        ResultSet resultSet1 = statement.executeQuery("show tables");
//        while (resultSet1.next()) {
//            System.out.println(resultSet1.getString(1));
//        }
//        System.out.println("-----------------");
//        statement.executeUpdate("drop table subject");
//
//        ResultSet resultSet3 = statement.executeQuery("show tables");
//        while (resultSet3.next()) {
//            System.out.println(resultSet3.getString(1));
//        }
//
//        Insert  ----------------------------------------------------------------------------
//
//        ResultSet resultSet4 = statement.executeQuery("select * from student");
//        while (resultSet4.next()) {
//            System.out.println(resultSet4.getInt(1) + " " + resultSet4.getString(2) + " " + resultSet4.getString(3) + " " + resultSet4.getDate(4) + " " + resultSet4.getInt(5));
//        }
//        System.out.println("-----------------");
//        statement.executeUpdate("insert into student values(null, 'Arsen', 'Karapetyan', '2004-07-17', 300000)");
//        ResultSet resultSet5 = statement.executeQuery("select * from student");
//        while (resultSet5.next()) {
//            System.out.println(resultSet5.getInt(1) + " " + resultSet5.getString(2) + " " + resultSet5.getString(3) + " " + resultSet5.getDate(4) + " " + resultSet5.getInt(5));
//        }
    }
}