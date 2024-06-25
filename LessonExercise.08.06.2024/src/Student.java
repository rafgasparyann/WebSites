public class Student {
    private String name;
    private String sName;
    private int age;

    public Student() {
    }

    public Student(String name, String sName, int age) {
        this.name = name;
        this.sName = sName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
