public class Hotel {
    private int Hid;
    private String Hname;
    private String Hdes;
    private String Hfac;
    private double rating;

    public Hotel(int hid, String hname, String hdes, String hfac, double rating) {
        Hid = hid;
        Hname = hname;
        Hdes = hdes;
        Hfac = hfac;
        this.rating = rating;
    }

    public int getHid() {
        return Hid;
    }

    public void setHid(int hid) {
        Hid = hid;
    }

    public String getHname() {
        return Hname;
    }

    public void setHname(String hname) {
        Hname = hname;
    }

    public String getHdes() {
        return Hdes;
    }

    public void setHdes(String hdes) {
        Hdes = hdes;
    }

    public String getHfac() {
        return Hfac;
    }

    public void setHfac(String hfac) {
        Hfac = hfac;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Hid=" + Hid +
                ", Hname='" + Hname + '\'' +
                ", Hdes='" + Hdes + '\'' +
                ", Hfac='" + Hfac + '\'' +
                ", rating=" + rating +
                '}';
    }
}
