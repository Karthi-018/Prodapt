class StreamingApplication{
	void play(){
		System.out.println("Playing media on the streaming service");
	}
}
class Netflix extends StreamingApplication{
	void play(){
		System.out.println("Streaming a movie or series on NETFLIX");
	}
}
class Spotify extends StreamingApplication{
	void play(){
		System.out.println("Streaming a song or playlist on SPOTIFY");
	}
}
public class Entertainment{
	public static void main(String[] args){
		StreamingApplication app1=new StreamingApplication();
		app1.play();
		Netflix app2=new Netflix();
		app2.play();
		Spotify app3=new Spotify();
		app3.play();
	}
}
	
		
