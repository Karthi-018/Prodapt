public class Exception_class{
    void divide(int n1,int n2){
        int result=0;
        int arr[]=new int[5];
        try{
            result=n1/n2;
            arr[5]=10;
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        Exception_class obj=new Exception_class();
        obj.divide(10,0);
    }
}