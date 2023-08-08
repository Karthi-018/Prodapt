import java.util.*;
class Main {
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
        ArrayList<Song> data=new ArrayList<>();
        data.add(Song.createSong("azhage,melody,04:20,4.8"));
	data.add(Song.createSong("believer,pop,04:00,4.0"));
	data.add(Song.createSong("made me,rock,03:20,3.8"));
	data.add(Song.createSong("vizhigalil,melody,03:30,3.0"));
	data.add(Song.createSong("Think,pop,02:55,4.2"));
        
        
	int num=sc.nextInt();
        if(num==1){
	    Collections.sort(data,Comparator.comparing(Song::getDuration).reversed());
	    for(Song s:data){
		System.out.println(s);
	    }		
	}
        else if(num==2){
	    Collections.sort(data,Comparator.comparing(Song::getRating).reversed());  
	    for(Song s:data){
		System.out.println(s);
	    }		  
	}
	else if(num==3){
	    System.out.println("Enter the name of the song to be searched");
            String n=sc.next();
	    for(int i=0;i<data.size();i++){
		Song t=data.get(i).getTitle();
	        if(t.equals(n)){
		    name=n;
		    System.out.println(data.get(i));
		}
		else{
		    throw new SongNotFoundException(n);
                }
	}
    }
}			 
		    