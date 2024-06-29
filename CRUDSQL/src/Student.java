import java.time.LocalDate;

public class Student {
    private int stid;
    private String name;
    private String surname;
    private LocalDate date;
    private int pay;

    public Student() {
    }

    public Student(int stid, String name, String surname, LocalDate date, int pay) {
        this.stid = stid;
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.pay = pay;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
