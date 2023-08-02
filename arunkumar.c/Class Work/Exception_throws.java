public class Exception_throws {
    void myFun(int n1,int n2,int size,String str)throws Exception {
        int arr[] = new int[size];
        if (str == null) {
            throw new NullPointerException();
        } else {
            System.out.println(str.length());
        }
        if (n2 == 0) {
            throw new ArithmeticException();
        }
        for (int i = 0; i < size; i++) {
            arr[i]=i+1;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        Exception_throws obj=new Exception_throws();
        try{
            obj.myFun(10,0,5,"Hi");

        }

        catch(Exception e){
            System.out.println(e);
        }

    }
}