public class ShapeInterface implements Interface{
    public int area(int l,int b){
        return l*l;
    }

    public static void main(String[] args) {
        ShapeInterface shape=new ShapeInterface();
        System.out.println(shape.area(2,2));
        shape.arearect(2,4);
    }
}

interface Interface {
    //int l=4;
   // int b=2;
    int area(int l,int b);
    default  void arearect(int l,int b){
        System.out.println(l*b);
    }
}
