public class Phone {
    private int stid;
    private String prov;
    private int number;

    public Phone() {
    }

    public Phone(int stid, String prov, int number) {
        this.stid = stid;
        this.prov = prov;
        this.number = number;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
