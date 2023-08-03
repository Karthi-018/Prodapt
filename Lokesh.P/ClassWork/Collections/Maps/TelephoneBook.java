class TelephoneBook {
    private String name;
    private  String mobileno;


    public TelephoneBook(String name, String mobileno) {
        this.name = name;
        this.mobileno = mobileno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "Name_Pojo{" +
                "name='" + name + '\'' +
                ", mobileno=" + mobileno +
                '}';
    }
}
