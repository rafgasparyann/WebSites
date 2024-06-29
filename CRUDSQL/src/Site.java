public class Site {
    private int stid;
    private String name;
    private int year;

    public Site() {
    }

    public Site(int stid, String name, int year) {
        this.stid = stid;
        this.name = name;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Site{" +
                "stid=" + stid +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}' + "\n";
    }
}
