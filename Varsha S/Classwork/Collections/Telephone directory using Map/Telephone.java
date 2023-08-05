public class Telephone {

    private String name;
    private double number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Telephone(String name, double number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
