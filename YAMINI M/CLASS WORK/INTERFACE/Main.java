interface Calculator {
    default void add(int n1, int n2) {
        System.out.println("The Sum is" + (n1 + n1));
        mul(n1, n2);
        div(n1, n2);
    }

    static void sub(int n1, int n2) {
        System.out.println("The difference is" + (n1 - n1));
    }

    default void mul(int n1, int n2) {
        System.out.println("The difference is" + (n1 * n1));
    }

     static void div(int n1, int n2) {
        System.out.println("The difference is" + (n1 / n1));
    }
}
    class Demo implements Calculator
    {
        public static void main(String args[])
        {
            Demo d=new Demo();
            d.add(10,20);
            Calculator.sub(30,20);
        }
    }
