public class IceCream {
    private int ic_no;
    private String ic_name;
    private String ic_flavor;
    private double ic_price;
    IceCream()
    {

    }

    public IceCream(int ic_no, String ic_name, String ic_flavor, double ic_price) {
        this.ic_no = ic_no;
        this.ic_name = ic_name;
        this.ic_flavor = ic_flavor;
        this.ic_price = ic_price;
    }

    public int getIc_no() {
        return ic_no;
    }

    public void setIc_no(int ic_no) {
        this.ic_no = ic_no;
    }

    public String getIc_name() {
        return ic_name;
    }

    public void setIc_name(String ic_name) {
        this.ic_name = ic_name;
    }

    public String getIc_flavor() {
        return ic_flavor;
    }

    public void setIc_flavor(String ic_flavor) {
        this.ic_flavor = ic_flavor;
    }

    public double getIc_price() {
        return ic_price;
    }

    public void setIc_price(double ic_price) {
        this.ic_price = ic_price;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "ic_no=" + ic_no +
                ", ic_name='" + ic_name + '\'' +
                ", ic_flavor='" + ic_flavor + '\'' +
                ", ic_price=" + ic_price +
                '}';
    }
}
