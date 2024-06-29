import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        SiteDAO siteDAO = new SiteDAO();
        siteDAO.fillSite();
        siteDAO.printList();

        PhoneDAO phoneDAO = new PhoneDAO();
        phoneDAO.fillPhone();
        phoneDAO.printPhoneList();

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.fillStudent();
        studentDAO.printStudentList();
    }
}