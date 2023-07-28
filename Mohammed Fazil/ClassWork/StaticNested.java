class Test{ 
 
  static int data=30;  
  static class Test2{  
   void msg(){
    System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  Test.Test2 obj=new Test.Test2();  
  obj.msg();  
  }  
}