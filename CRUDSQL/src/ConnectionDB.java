import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static Connection connectionDB() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");
        System.out.println("\nConnected to database\n");
        return connection;
    }
}
