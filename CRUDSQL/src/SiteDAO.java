import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SiteDAO {
    List<Site> list = new ArrayList<>();

    public List<Site> getList() {
        return list;
    }

    public void setList(List<Site> list) {
        this.list = list;
    }

    public void fillSite() throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        ResultSet resultSet = statement.executeQuery("select * from site");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int year = resultSet.getInt(3);
            Site site = new Site(id, name, year);
            list.add(site);
        }
    }

    public void printList() throws SQLException {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getStid() + " " + list.get(i).getName() + " " + list.get(i).getYear());
        }
    }

    public void read() throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        ResultSet rs = statement.executeQuery("select * from site");
        while (rs.next()) {
            System.out.println(rs.getInt("stid") + " " + rs.getString("name") + " " + rs.getInt("year"));
        }
    }

    public void delete(String name) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        statement.executeUpdate("delete from site where name='" + name + "'");
    }

    public void update(String name, int stid, int year) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        statement.executeUpdate("update site set name='" + name + "' where stid=" + stid + " and year=" + year);
    }

    public void search(String name) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        ResultSet rs = statement.executeQuery("select * from site where name='" + name + "'");
        while (rs.next()) {
            System.out.println(rs.getInt("stid") + " " + rs.getString("name") + " " + rs.getInt("year"));
        }
    }

    public void insert(int stid, String name, int year) throws SQLException {
        Statement statement = ConnectionDB.connectionDB().createStatement();
        statement.executeUpdate("insert into site values (" + stid + ", '" + name + "', " + year + ")");
    }

}