class Dress{
void brand(String name){
System.out.println("The dress brand is"+ name);
}
void brand(String name ,String Quality){
System.out.println("The dress brand is " + name +"and Quality is "+ Quality);
}
}
class Main{
public  static void main(String[] args){
Dress d = new Dress();
d.brand("Allen solly");
d.brand("Allen solly","High quality");
}
}