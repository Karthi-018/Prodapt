public class Main{
    public static void main(String args[]){
        Main m=new Main();
        m.Student("Ram","Ravi");
    }
    void Student(){
        System.out.println("Mass Bunk");
    }
    void Student(String...s){
        System.out.println(s.length+" Students are present");
        System.out.println("Names:");
        for(String i:s){
            System.out.println(i);
        }
    }
}