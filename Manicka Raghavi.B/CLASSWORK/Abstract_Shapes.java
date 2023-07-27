abstract class Shape 
{ 
int length;
int breadth;

abstract void area();

}

class Triangle extends Shape 
{ 
Triangle(int length,int breadth)
{ 
this.length=length;
this.breadth=breadth;
}
@override
void area(int length,int breadth)  
{ 
System.out.println("The area of triangle is:"+(0.5*length*breadth));
}
} 

class Square extends Shape 
{  
Square(int length) 
{ 
this.length=length;
}
void area()  
{ 
System.out.println("The area of Square is:"+(length*length));
}
} 

class Rectangle extends Shape 
{ 
Rectangle(int length,int breadth)
{ 
this.length=length;
this.breadth=breadth;
}
void area()  
{ 
System.out.println("The area of Rectangle is:"+(length*breadth));
}
} 

class Abstract_Shapes 
{
public static void main(String[]args) 
{ 
Shape object=new Triangle(10,5);
object.area(10,5);

object=new Square(5);
object.area();

object=new Rectangle(10,5);
object.area();
}
}
