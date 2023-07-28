class Demo{
    void myFun{
        System.out.println("Instance");
    }
    static void myFun(String str){
        System.out.println("Static");
    }
    public static void main(String args[]){
        Demo d=new Demo();
        d.myFun();
        d.myFun("AAA");
    }
}