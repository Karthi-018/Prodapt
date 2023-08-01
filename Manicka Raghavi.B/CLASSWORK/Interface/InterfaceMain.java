interface DemoInterface 
{ 

default void display()
{ 
System.out.print("Hello");
}
} 

interface DemoInterface2 
{ 
default void display1()
{ 
System.out.print("Hi");
}
} 

class Demo 
{ 
public void display() 
{ 
System.out.print("HiHello");
}
}
class InterfaceMain extends Demo implements DemoInterface,DemoInterface2 
{ 

public void display() 
{ 
System.out.print("HiHelloMainMEthod");
}
public static void main(String[]args) 
{ 
InterfaceMain obj=new InterfaceMain();
obj.display();
}
}