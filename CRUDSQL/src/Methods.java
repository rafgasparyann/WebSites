import java.sql.*;

public class Methods {
    public void read(String tableName) throws SQLException {
        Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");
        Statement statement = connection1.createStatement();
        ResultSet rs = statement.executeQuery("select * from " + tableName);
        while (rs.next()) {
            System.out.println(rs.getInt("stid") + " " + rs.getString("name"));
        }
    }

    public void delete(String tableName) throws SQLException {
        Connection connection3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");
        Statement statement = connection3.createStatement();
        statement.executeUpdate("drop table " + tableName);
    }
}