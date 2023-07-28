class Sport{
	void play(){
		System.out.println("Playing");
	}
}
class Cricket extends Sport{
	void play(){
		System.out.println("Playing cricket");
	}
}
class Tennis extends Sport{
	void play(){
		System.out.println("Playing Tennis");
	}
}
public class Entertainment{
	public static void main(String[] args){
		Sport s1=new Cricket();
		s1.play();
		Sport s2=new Tennis();
		app2.play();
	}
}