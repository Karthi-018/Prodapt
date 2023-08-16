public class Item {
    private static String name;
    private static Double price;
    private static String type;

    Item(ItemDAO itd){}
    public Item(String name, Double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
