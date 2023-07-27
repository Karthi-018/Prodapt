class charint {
    void display(char a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        charint c = new charint();
        c.display('x', 3);
        intchar i = new intchar();
        i.display(3, 'x');
    }

}
class intchar extends charint {
    void display(int a, char b) {
        System.out.println(a);
        System.out.println(b);
    }
}