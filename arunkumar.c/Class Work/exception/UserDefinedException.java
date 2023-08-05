package exception;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }
        catch(AgeException e){
            System.out.println("problem "+e);
        }

    }
    static void checkAge(int age) throws AgeException{
        if(age<0){
            throw new AgeException("age cant be negative");
        }
        else{
            System.out.println("welcome ");
        }
    }
}