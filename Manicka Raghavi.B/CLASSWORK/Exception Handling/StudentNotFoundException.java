package userdefinedexception; 

class StudentNotFoundException extends Exception
{ 

StudentNotFoundException(String name) 
{ 
 System.out.println("The Given Student Name:"+name+" not found in the Student Array! ");
} 

StudentNotFoundException(int id) 
{ 
 System.out.println("The Given Student ID:"+id+" not found in the Student Array! ");

}

}