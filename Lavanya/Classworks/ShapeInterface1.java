public class ShapeInterface1 extends Sqr implements Interface,Interface1 {
    @Override
//    public void areasq(){
//        //return l*b;
//        System.out.println("hii");
//    }
    public int areasq(int l,int b){
        return l*b;
       // System.out.println("hello");
    }

    public static void main(String[] args) {
        ShapeInterface1 shape = new ShapeInterface1();
        shape.areasq();
        System.out.println(shape.areasq1(1.0f,2));
       System.out.println(shape.areasq(1,2));

    }


}

class Sqr {
    public void areasq(){
        System.out.println("sqr");
        //return l*b;
    }
}


interface Interface1 {
    default float areasq1(float l, int b)
    {
        return l*b;
    }
}


interface Interface {
//     void areasq();
     default int areasq(int l,int b)
     {
        return l*b;
        //System.out.println("hello");
    }
}
