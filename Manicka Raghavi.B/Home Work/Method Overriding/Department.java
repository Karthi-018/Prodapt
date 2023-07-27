class Cse_Department 
{ 
void syllabus_to_covered()
{ 
 System.out.println("SYLLABUS TO BE COVERED IN THIS SEMESTER BY CSE:");
 System.out.println("1.Software Engineering & Project Management 2.Fullstack Development  3.Computer Graphics and Fundamentals of Image Processing 4.Computer Graphics and Image Processing Laboratory  5.Mini Project 6.Innovation/Entrepreneurship/Internship \n"); 
}
}

class Cse_A extends Cse_Department 
{ 

void syllabus_to_covered() 
{ 
System.out.println("SYLLABUS COVERED AS OF NOW IN THIS SEMESTER- BY CSE A are:");
System.out.println("1.Fullstack Development 2.Computer Graphics 3.Software Engineering & Project Management");
}

} 

class Cse_B extends Cse_Department 
{ 

void syllabus_to_covered()
{ 
System.out.println("SYLLABUS COVERED AS OF NOW IN THIS SEMESTER- BY CSE B are:");
System.out.println("1.Fullstack Development 2.Computer Graphics 3.Software Engineering & Project Management 4.Mini Project 5.Internship");
}

} 

class Department 
{ 
public static void main(String[] args) 
{ 
  Cse_Department o=new Cse_Department();
  o.syllabus_to_covered();

  //method overriding
  Cse_A object=new Cse_A();
  object.syllabus_to_covered(); 
  
  System.out.println("-----------------------------------------------------------");
   
  Cse_B obj=new Cse_B();
  obj.syllabus_to_covered(); 
  
}
}