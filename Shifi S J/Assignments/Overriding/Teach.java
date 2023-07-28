class Person {
    void teach() {    
      System.out.println("I can teach");
    } 
 }
 
 class Teacher extends Person {   
    void teach() {
      System.out.println("I can teach English comparatively good");
    }  
}
public class Teach{  
    public static void main(String[] args) {
      Teacher teacher = new Teacher();  
      teacher.teach();
      Person person1 = new Person();  
      person1.teach();
          
    }
 }
