public class TelePhone {
    private String tname;
    private String tnum;

    public TelePhone(String tname, String tnum) {
        this.tname = tname;
        this.tnum = tnum;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
    }

    @Override
    public String toString() {
        return "TelePhone{" +
                "tname='" + tname + '\'' +
                ", tnum=" + tnum +
                '}';
    }
}
