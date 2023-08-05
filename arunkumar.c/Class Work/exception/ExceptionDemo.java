package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number : ");
            int x = sc.nextInt();
            System.out.println("Enter number : ");
            int y = sc.nextInt();
            int z = x/y;
            System.out.println("The result : "+z);
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide by 0 ");
        }
        catch (InputMismatchException e){
            System.out.println("input miss matched idiot");
        }
        catch (Exception e){
            System.out.println("Something went wrong ");
        }
        finally {
            System.out.println("i will always work");
            sc.close();
        }
        System.out.println("I am outside");
    }
}
