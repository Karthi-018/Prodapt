interface Demo1 {
    default void display() {
        System.out.println("Hai");
    }
}
class Demo_class {
    public void display() {
        System.out.println("Hello");
    }
}

class Interface2 extends Demo_class implements Demo1 {
    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        obj.display();

    }
}
