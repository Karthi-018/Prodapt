class College 
{ 
void Courses()
{ 
 System.out.println("Courses Offered by the College:");
 System.out.println("1.Artificial Intelligence and Data Sciences 2.Information Technology  3.Computer Science Engineering 4.Electronic Communication Engineering \n"); 
}
}

class It extends College 
{ 
void Courses() 
{ 
System.out.println("Subjects in IT Department:");
System.out.println("1.Java 2.Computer Networks 3.Computer Architecture 4.C \n");
}
} 

class AiDs extends College 
{ 
void Courses()
{ 
System.out.println("Subjects in AIDS Department:");
System.out.println("1.Artificial Intelligence 2.Data Science 3.R Programming 4.Machine Learning \n");
}
} 

class Cse extends College 
{ 
void Courses()
{ 
System.out.println("Subjects in CSE Department:");
System.out.println("1.Python 2.C++ 3.DBMS 4.Full Stack \n");
}
} 

class Ece extends College 
{ 
void Courses()
{ 
System.out.println("Subjects in ECE Department:");
System.out.println("1.Analog 2.Digital 3.Transmitter 4.Microwaves \n");
}
}
 