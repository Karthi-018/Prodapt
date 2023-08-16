public class Item
{
    private String name;
    private Double price;
    private String type;

public Item()    //default constructor
{

}
    Item(String name,Double price,String type)     //parametrized constructor
    {
        this.name=name;
        this.price=price;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

public String toString() 
{
return "FoodPojo [name=" + name + ", price=" + price + ", type=" + type + "]";
}
}