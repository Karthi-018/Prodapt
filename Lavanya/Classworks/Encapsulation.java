//pojo
//default and parameterized constructor
public class Encapsulation {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Encapsulation() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation("riya",123);
        Encapsulation obj1=new Encapsulation();
        System.out.println(obj.getName());
        obj1.setId(146);
        System.out.println(obj1.getId());


    }
}
