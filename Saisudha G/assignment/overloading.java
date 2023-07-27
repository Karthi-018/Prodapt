class Aggregate{
	public float agr(float x,float y){
		return ((x+y)/2);
	}
	public int agr(int x,int y,int z){
		return ((x+y+z)/3);
	}
	public int agr(int y,int z){
		return((y+z)/2);
	}
public static void main(String a[]){
	Aggregate o=new Aggregate();
	System.out.println(o.agr(10,65));
	System.out.println(o.agr(11,60,2));
	System.out.println(o.agr(10,16));
	}}