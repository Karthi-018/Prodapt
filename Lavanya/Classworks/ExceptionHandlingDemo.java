import java.lang.*;
public class ExceptionHandlingDemo {
    public static void main(String[] args) throws Exception {
       ExceptionHandlingDemo e=new ExceptionHandlingDemo();
      // e.divide(10,10);
        try {
            e.myFun( 5, null);
        }
        catch(Exception e1){
            System.out.println(e1);

        }
    }
//    void divide(int n,int m){
//        int result=0;
//        int a[]=new int[5];
//        try{
//            result=n/m;
//            a[5]=10;
//        }
////        finally {
////            System.out.println("exception");
////        }
//
//        catch(ArithmeticException | ArrayIndexOutOfBoundsException  e){
//            // we cant give Exception here within this catch
//            System.out.println(e);
//        }
//
//        catch(Exception e2){
//            System.out.println(e2);
//        }
    void myFun(int size,String str) throws Exception {
        int a[]=new int[size];
//        if(str==null){
//            throw new NullPointerException();
//        }
//        else{
//            System.out.println(str.length());
//        }
        for(int i=0;i<=size;i++){
            a[i]=i+1;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
    }

/* when we want to create an user defined exception
//   class EmployeeNotFoundDException extends Exception {
EmployeeNotFoundDException(String name){
System.out.println(name+ " not present in the database");
}
}
throw new EmployeeNotFoundDException("abc");
 */