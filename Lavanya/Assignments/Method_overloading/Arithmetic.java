public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        System.out.println("Addition of 2 numbers : "+obj.addition(3,2));
        System.out.println("Addition of 3 numbers : "+obj.addition(2,4,5));

    }
    int addition(int num1,int num2){
        return num1+num2;
    }
    int addition(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}
