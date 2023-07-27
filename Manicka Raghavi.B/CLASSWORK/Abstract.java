abstract class Electronic_Device 
{ 
abstract void turnon();

abstract void turnoff(); 

void commonWorking() 
{ 
System.out.println("DEVICES work on electricity");
}

}

class TV extends Electronic_Device 
{ 
void turnon() 
{ 
System.out.println("TV turned on using the remote");
} 
void turnoff() 
{ 
System.out.println("TV turned off using the remote");
}
}

class Fan extends Electronic_Device 
{ 
void turnon() 
{ 
System.out.println("Fan turned on using the switch board");
} 
void turnoff() 
{ 
System.out.println("Fan turned off using the switch board");
}

}

class Abstract 
{ 
public static void main(String[]args) 
{ 
TV object=new TV();
object.turnon();
object.turnoff();
object.commonWorking();

Fan obj=new Fan();
obj.turnon();
obj.turnoff();
obj.commonWorking();
}
}