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

    public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getStid() + " " + list.get(i).getName() + " " + list.get(i).getYear());
        }
    }
}
