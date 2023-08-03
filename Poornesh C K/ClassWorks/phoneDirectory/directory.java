public class directory {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    String no;
    public directory(String name,   String no) {
        this.name = name;
        this.no = no;
    }
    @Override
    public String toString() {
        return " Name : " +   name +"\n    phone Number: " + no ;
    }

}
