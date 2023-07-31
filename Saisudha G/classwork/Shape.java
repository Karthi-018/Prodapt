abstract class Geomentrical_Shapes{
	
	double l;
	double b;
	abstract void area();
	}
class square extends Geomentrical_Shapes{
	square(double l){
	this.l=l;
	}
	void area(){
		System.out.println("Area of square is:"+(l*l));
	}
	}
class rectangle extends Geomentrical_Shapes{
	rectangle(double l,double b){
	this.l=l;
	this.b=b;
	}
	void area(){
		System.out.println("Area of Rectangle is:"+(l*b));
	}
	}
class triangle extends Geomentrical_Shapes{
	triangle(double l,double b){
	this.l=l;
	this.b=b;
	}
	void area(){
		System.out.println("Area of triangle is:"+((1/2)*l*b));
	}}

class shape{
	public static void main(String a[]){
		Geomentrical_Shapes g= new square(2.5);
		g.area();
		Geomentrical_Shapes o= new rectangle(1.5,1.2);
		o.area();
		Geomentrical_Shapes h= new triangle(2.1,4.0);
		h.area();
}}