public class Hotels {
    private  int HID;
    private String HName;
    private String HDesc;
    private String HFac;
    private Double Rating;

    public Hotels(int HID, String HName, String HDesc, String HFac, Double rating) {
        this.HID = HID;
        this.HName = HName;
        this.HDesc = HDesc;
        this.HFac = HFac;
        this.Rating = rating;
    }

    public int getHID() {
        return HID;
    }

    public void setHID(int HID) {
        this.HID = HID;
    }

    public String getHName() {
        return HName;
    }

    public void setHName(String HName) {
        this.HName = HName;
    }

    public String getHDesc() {
        return HDesc;
    }

    public void setHDesc(String HDesc) {
        this.HDesc = HDesc;
    }

    public String getHFac() {
        return HFac;
    }

    public void setHFac(String HFac) {
        this.HFac = HFac;
    }

    public Double getRating() {
        return Rating;
    }

    public void setRating(Double rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "Hotl{" +
                "HID=" + HID +
                ", HName='" + HName + '\'' +
                ", HDesc='" + HDesc + '\'' +
                ", HFac='" + HFac + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
