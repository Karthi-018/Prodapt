 class add {
     int Cal(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        add a = new add();
        mul m = new mul();
        System.out.println("add: " + a.Cal(8, 5));
        System.out.println("mul: " + m.Cal(8, 5));
    }
}
 class mul extends add {
     int Cal(int a, int b) {
        return a * b; 
    }
}
