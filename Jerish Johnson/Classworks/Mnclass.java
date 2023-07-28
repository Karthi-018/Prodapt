class Nested{
	String movie="John wick";
	static String movreview="Good";
	static class Fame{
		void call(){
			Nested n=new Nested();
			System.out.println("The movie : "+n.movie);
			System.out.println("the movie review is : "+Nested.movreview);
		}
	}
}

class Mnclass{
	public static void main(String []args){
		Nested.Fame d= new Nested.Fame();
		d.call();
	}
}