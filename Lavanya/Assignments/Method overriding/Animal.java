public class Animal {
    public static void main(String[] args) {
       Animal obj1=new Cow();
       Animal obj2=new Lion();
       obj1.eat();
       obj2.eat();
    }
    void eat(){
        System.out.println("Eats differently");
    }
}
class Lion extends Animal {
    void eat(){
        super.eat();
        System.out.println("Eats flesh");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
