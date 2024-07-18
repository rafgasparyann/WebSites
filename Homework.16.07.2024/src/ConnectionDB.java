import java.sql.*;

public class ConnectionDB {
    public static Connection connectionDB() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");
        return connection;
    }

    public String retrieveData() throws SQLException {
        StringBuilder data = new StringBuilder();
        String query = "SELECT * FROM student";
        Connection connection = connectionDB();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            data.append("ID: ").append(resultSet.getInt("stid")).append(", Name: ").append(resultSet.getString("name")).append(", Surname: ").append(resultSet.getString("surname")).append(", Pay: ").append(resultSet.getInt("pay")).append("\n");
        }
        return data.toString();
    }

    public void delete(String id) throws SQLException {
        String query = "DELETE FROM student WHERE stid = " + id;
        Connection connection = connectionDB();
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }

    public void update(String id, String name, String surname, String pay) throws SQLException {
        String query = "UPDATE student SET ";
        boolean first = true;
        if (!name.isEmpty()) {
            query += "name = '" + name + "'";
            first = false;
        }
        if (!surname.isEmpty()) {
            if (!first) query += ", ";
            query += "surname = '" + surname + "'";
            first = false;
        }
        if (!pay.isEmpty()) {
            if (!first) query += ", ";
            query += "pay = " + pay;
        }
        query += " WHERE stid = " + id;
        Connection connection = connectionDB();
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }
}
