class Demo_Polymorphism{
    public void Add(int var1,int var2,int var3){
        System.out.println("Sum of 3 integer values:"+(var1+var2+var3));
    }
    public void Add(double val1,double val2){
        System.out.println("Sum of 2 float values:"+(val1+val2));
    }
    public void Add(String s1,String s2){
        System.out.println("Sum of two integer values:"+(s1+s2));
    }
    public void Add(int i1,int i2){
        System.out.println("Sum of 2 integer values:"+(i1+i2));
    }
}
class Polymorphism{
    public static void main(String args[]){
        Demo_Polymorphism obj=new Demo_Polymorphism();
        obj.Add(2,3);
        obj.Add(1.5,6.0);
        obj.Add(3,4,5);
    }
}




        
        
 