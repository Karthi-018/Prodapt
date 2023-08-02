class StudentNotFoundException extends Exception
{ 

StudentNotFoundException(String name) 
{ 
 System.out.println("Student name:"+name+" not found");
} 

StudentNotFoundException(int id) 
{ 
 System.out.println("Student ID:"+id+" not found");

}

}