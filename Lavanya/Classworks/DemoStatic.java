public class DemoStatic {
    public static void main(String[] args) {
        DemoStatic d=new DemoStatic();
        d.display();
        display("LAVANYA");

    }
    void display(){
        System.out.println("non static");
    }
    static void display(String name){
        System.out.println("static "+name);

    }
}
