import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int a =3;
        System.out.println("\nThe ______ keyword is used to call the constructor of the parent class");
        System.out.println("1 this");
        System.out.println("2 parent class name");
        System.out.println("3 super");
        System.out.println("4 parent");
        System.out.println("Enter your choice: \t");
        int answer1 = scanner.nextInt();
        if(answer1<=4){

            if(a==answer1) {
            count++;
        }
        else{
            System.out.println("Wrong answer , correct option is "+a);
        }}
        else{
            System.out.println("Option not found");
        }
      //  System.out.println(count);
        int b = 3;
        System.out.println("\nWhich of the following options compares only object references");
        System.out.println("1 toString()");
        System.out.println("2 equals()");
        System.out.println("3 ==");
        System.out.println("4 hashCode()");
        System.out.println("Enter your choice: \t");
        int answer2 = scanner.nextInt();
        if(answer2<=4){

            if(b==answer2) {
            count++;
        }
        else{
            System.out.println("Wrong answer , correct option is "+b);
        }}
         else{
            System.out.println("Option not found");
        }
        int c=3;
        System.out.println("\nNumber of primitive data types in Java are");
        System.out.println("1 6");
        System.out.println("2 7");
        System.out.println("3 8");
        System.out.println("4 9");
        System.out.println("Enter your choice: \t");
        int answer3 = scanner.nextInt();
        if(answer3<=4){

            if(c==answer3) {
            count++;
        }
        else{
            System.out.println("Wrong answer , correct option is "+c);
        }}
        else{
            System.out.println("Option not found");
        }
        int d=2;
        System.out.println("\nJava permits a class to extend only one other class directly. This is called __________");
        System.out.println("1 Hierarchical inheritance");
        System.out.println("2 single inheritance");
        System.out.println("3 multilevel inheritance");
        System.out.println("4 hybrid inheritance");
        System.out.println("Enter your choice: \t");
        int answer4 = scanner.nextInt();
        if(answer4<=4){
            if(d==answer4) {
            count++;
        }
        else{
            System.out.println("Wrong answer , correct option is "+d);
        }}
     else{
        System.out.println("Option not found");
    }
        System.out.println("Your score is "+count);
    }
}
