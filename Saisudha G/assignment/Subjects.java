class Subjects{

String name;
int credits;

Subjects(String name,int credits){
	this.name=name;
	this.credits=credits;
}
public void display(){
	System.out.println("subject name:"+name);
	System.out.println("credit score:"+credits);
	}}

class Mathematics extends Subjects{

int papers;
Mathematics(String name,int credits,int papers){
super(name,credits);
this.papers=papers;
}

@override
public void display(){

super.display();
System.out.println("No.of.Papers:"+papers);
}}
class Science extends Subjects{

String labequipments;
Science(String name,int credits,int papers,String labequipments){
super(name,credits);
this.labequipments=labequipments;
}
@override
public void display(){
super.display();
System.out.println("Required lab equipments:"+labequipments);
}}

public class sub{
	public static void main(String args[]){
		Subjects s1=new Mathematics("Trignometry",5,1);
		Subjects s2=new Science("Chemistry",4,"beaker");
	s1.display();
	s2.display();
}}
	 


	
	
	