abstract class Shapes {
int len;
int bre;
abstract void area();

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBre() {
        return bre;
    }

    public void setBre(int bre) {
        this.bre = bre;
    }
}

class Square extends Shapes{
    public void area(){
        System.out.println(len*len);
    }

}

class Rectangle extends Shapes {
    public void area(){
        System.out.println(len*bre);
    }

}

public class Main1 {
    public static void main(String[] args) {
        Shapes obj=new Square();
        obj.setLen(2);
        obj.setBre(3);
        obj.area();
    }
}

