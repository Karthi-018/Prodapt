public class TelePhone {

    private String number;
    private String name;

    public TelePhone(String name,String number) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TelePhone{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}




