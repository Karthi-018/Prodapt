public class Testthrows1 {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Testthrows1 t1 = new Testthrows1();
        try {
            checkAge(15); // Set age to 15 (which is below 18...)
        }
        catch (Exception e)
        {
            System.out.println("Exception resolved u can vote after 18");
        }
    }
}
