import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        Site site1 = new Site(1, "meet.google.com", 2017);
        Phone phone1 = new Phone(4,"VivaMTS",77344377);
        Student student1 = new Student("Vardan","Zakaryan",LocalDate.of(2004, 4, 4),374000);

        SiteDAO siteDAO = new SiteDAO();

//        siteDAO.fillSite();
//        siteDAO.printList();
//        siteDAO.read();
//        siteDAO.delete("busy.am");
//        siteDAO.update("axm.am",1,2018);
//        siteDAO.search("buy.am");
//        siteDAO.insert(1, "lets.go", 2017);
//        siteDAO.create(site1);
//        siteDAO.sort();
//
        PhoneDAO phoneDAO = new PhoneDAO();

//        phoneDAO.fillPhone();
//        phoneDAO.printPhoneList();
//        phoneDAO.read();
//        phoneDAO.delete("55455575");
//        phoneDAO.update(String.valueOf(77777777),1, "VivaMTS");
//        phoneDAO.search(1);
//        phoneDAO.insert(3,"VivaMTS",93333738);
//        phoneDAO.create(phone1);
//        phoneDAO.sort();
//
        StudentDAO studentDAO = new StudentDAO();

//        studentDAO.fillStudent();
//        studentDAO.sort(studentDAO.studentList);
//        studentDAO.printStudentList();
//        studentDAO.read();
//        studentDAO.delete("Alen", "Hakobyan", 300000);
//        studentDAO.update("Hamlet",4);
//        studentDAO.search("Ani");
//        studentDAO.insert("Valer", "Vardanyan", LocalDate.of(2004, 7, 8), 555888);
//        studentDAO.create(student1);
//


    }
}