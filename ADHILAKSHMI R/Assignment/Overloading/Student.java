public class Student
 {
  void record(String Name,char grade)
  {
    System.out.println("Student name is " +Name+ "Grade is" +grade);
  }
  void record(int id,String studentName,char grade)
  {
    System.out.println("Student ID is "+id+ "and name is "+studentName+ "and grade is" +grade);
  }
  public static void main(String[]args)
  {
    Student Obj=new Student();
    Obj.record("Renuka",'B');
    Obj.record(8, "Bhumika", 'A');
  }
}
