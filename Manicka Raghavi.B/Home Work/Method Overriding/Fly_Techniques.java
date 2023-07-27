abstract class Bird 
{ 
  abstract void flying_technique();
}

class Flamingos extends Bird
{ 
void flying_technique() 
{ 
System.out.println("The Flamingos use gliding flight technique to fly.The wings are held out to the side of body, and they tend to move in the air due to airflow in the opposite direction\n"); 
}
} 

class Blackbirds extends Bird
{ 
void flying_technique() 
{ 
System.out.println("The Blackbirds fly by continuous flapping.They flap their wings in up-down motion.This helps them fly forward\n"); 
}
} 

class Hummingbirds extends Bird
{ 
void flying_technique() 
{ 
System.out.println("The Hummingbirds uses hovering technique to fly. They remain motionless that is wind hovering through generating lift.\n");  
}
} 

class Fly_Techniques 
{ 
public static void main(String[] args) 
{ 

//method overriding 

Flamingos object=new Flamingos();
object.flying_technique(); 
  
System.out.println("-----------------------------------------------------------------------------------------------------");

Blackbirds obj=new Blackbirds();
obj.flying_technique();  

System.out.println("-----------------------------------------------------------------------------------------------------");

Hummingbirds ob=new Hummingbirds();
ob.flying_technique(); 

}
}