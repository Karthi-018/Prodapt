interface Shape 
{ 
 int a=10;
 int b=5;
 void area();
}

class Triangle implements Shape 
{ 
int length;
int breadth;

Triangle(int length,int breadth) 
{
this.length=length;
this.breadth=breadth;
}
public void area()  
{ 
System.out.println("The area of triangle is:"+(0.5*length*breadth));
}
} 

class Square implements Shape 
{ 
int length; 
Square(int length) 
{ 
this.length=length;
}
public void area()  
{ 
System.out.println("The area of Square is:"+(length*length));
}
} 

class Rectangle implements Shape 
{ 
int length;
int breadth;
Rectangle(int length,int breadth)
{ 
this.length=length;
this.breadth=breadth;
}
public void area()  
{ 
System.out.println("The area of Rectangle is:"+(length*breadth));
}
} 

class InterfaceShapes 
{
public static void main(String[]args) 
{

//one method to create a object
Triangle object=new Triangle();
object.area(10,5);

//Another method to create a object
Square obj=new Square(5);
obj.area();

Rectangle ob=new Rectangle(10,5);
ob.area();
}

}