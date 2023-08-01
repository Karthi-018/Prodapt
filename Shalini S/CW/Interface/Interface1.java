    interface Demo{
        default void display() {
            System.out.println("Hai");
        }
    }

    interface Demo2 {
        default void display() {
            System.out.println("Hello");
        }
    }

    public class Interface1 implements Demo,Demo2 {
        public void display() {
            System.out.println("Hello World");
        }

        public static void main(String[] args) {
            Interface1 obj = new Interface1();
            obj.display();

        }
    }
