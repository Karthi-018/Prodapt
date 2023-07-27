class cal {
public static void main(String[] args) {
Calculator calculator = new Calculator();
System.out.println(calculator.calc(1,2)); 
System.out.println(calculator.calc(2,3,4)); 
System.out.println(calculator.calc(2.0f,1.0f));
System.out.println(calculator.calc(2,3,4,1)); 
System.out.println(calculator.calc(100l,10l));
    }
}
class Calculator{
 public int calc(int a,int b){
        return a+b;
    }
public int calc(int a,int b,int c) {
        return a+b+c;
    }
 public float calc(float h,float i){
        return h-i;
    }
public int calc(int d,int e,int f,int g) {
        return d*e*f*g;
    }
public long calc(long j,long k){
        return j/k;
    }

}
