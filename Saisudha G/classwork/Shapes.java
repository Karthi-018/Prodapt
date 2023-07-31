interface Geomentrical_Shapes{
	
	
	void area();
	}
class square implements Geomentrical_Shapes{
	double l;
	square(double l){
		this.l=l;
	}
	public void area(){
		System.out.println("Area of square is:"+(l*l));
	}
	} 
class rectangle implements Geomentrical_Shapes{
	double l;
	double b;
	rectangle(double l,double b){
	this.l=l;
	this.b=b;
	}
	public void area(){
		System.out.println("Area of Rectangle is:"+(l*b));
	}
	}
class triangle implements Geomentrical_Shapes{
	double l;
	double b;
	triangle(double l,double b){
	this.l=l;
	this.b=b;
	}
	public void area(){
		System.out.println("Area of triangle is:"+((0.5)*l*b));
	}}
class shapes{
	public static void main(String a[]){
		Geomentrical_Shapes g= new square(2.5);
		g.area();
		Geomentrical_Shapes o= new rectangle(1.5,1.2);
		o.area();
		Geomentrical_Shapes h= new triangle(2.1,4.0);
		h.area();
}}