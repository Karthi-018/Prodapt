class square {
    void display() {
        System.out.println("Square");
    }

    public static void main(String[] args) {
        square s = new square();
        s.display();
        rectangle r = new rectangle();
        r.display();
    }

}


class rectangle extends square {
    void display() {
        System.out.println("Rectangle");
    }
}