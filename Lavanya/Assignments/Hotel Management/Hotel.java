public class Hotel {

    int hid;
    String hname;
    int rating;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }


    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Hotel(int hid, String hname, int rating) {
        this.hid = hid;
        this.hname = hname;
        this.rating = rating;
    }



    @Override
    public String toString() {
        return "Hotel Details { " +
                "Hotel id :" + hid +
                " , Name :" + hname +
                " , Rating :" + rating +
                " } ";
    }

}
