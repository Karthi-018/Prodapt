import java.util.*;
import java.text.*;
import java.io.*;
class Main {
    public static void main(String args[])throws Exception{
	Scanner sc=new Scanner(System.in);
        ArrayList<Song> data=new ArrayList<>();
        data.add(Song.createSong("azhage,melody,04:20,4.8"));
	data.add(Song.createSong("believer,pop,04:00,4.0"));
	data.add(Song.createSong("mademe,rock,03:20,3.8"));
	data.add(Song.createSong("vizhigalil,melody,03:30,3.0"));
	data.add(Song.createSong("Think,pop,02:55,4.2"));
        
        System.out.println("1->Sort data based on duration in ascending order");
	System.out.println("2->Sort data based on rating in ascending order");
	System.out.println("3->Search using the song name");
	
	int num=sc.nextInt();
        if(num==1){
	    Collections.sort(data,((o1, o2)-> o1.getDuration().compareTo(o2.getDuration())));
	    //Collections.sort(data,Comparator.comparing(Song::getDuration));
	    for(int i=0;i<data.size();i++){
		DateFormat df=new SimpleDateFormat("mm:ss");
		//System.out.println(s);
		System.out.format("%-20s %-10s %-12s %-12s\n","TITLE","GENRE","DURATION","RATING");
		System.out.format("%-20s %-10s %-12s %-12s\n",data.get(i).getTitle(),data.get(i).getGenre(),df.format(data.get(i).getDuration()),data.get(i).getRating());
	    }		
	}
        else if(num==2){
	     Collections.sort(data,((o1, o2)->{
		if(o1.getRating()>o2.getRating()){
			return 1;
		}
		else{return -1;}
		}));
	    //Collections.sort(data,Comparator.comparing(Song::getRating));  
	    for(int i=0;i<data.size();i++){
		DateFormat df=new SimpleDateFormat("mm:ss");
		//System.out.println(s);
		System.out.format("%-20s %-10s %-12s %-12s\n","TITLE","GENRE","DURATION","RATING");
		System.out.format("%-20s %-10s %-12s %-12s\n",data.get(i).getTitle(),data.get(i).getGenre(),df.format(data.get(i).getDuration()),data.get(i).getRating());
	    }		  
	}
	else if(num==3){
	    System.out.println("Enter the name of the song to be searched");
            String n=sc.next();
	    boolean flag = false;
	    //String name=null;
	    for(int i=0;i<data.size();i++){
		String t=data.get(i).getTitle();
	        if(t.equals(n)){
		    //name=n;
		    //System.out.println(data.get(i));
		    DateFormat df=new SimpleDateFormat("mm:ss");
		    System.out.format("%-20s %-10s %-12s %-12s\n","TITLE","GENRE","DURATION","RATING");
		System.out.format("%-20s %-10s %-12s %-12s\n",data.get(i).getTitle(),data.get(i).getGenre(),df.format(data.get(i).getDuration()),data.get(i).getRating());
			flag = true;
		    //--------serialization
		    
		    File file=new File("Song.txt");
				try(FileOutputStream fout=new FileOutputStream(file);
           			ObjectOutputStream objt=new ObjectOutputStream(fout)){
                		objt.writeObject(i);
						}
				catch(Exception e){
					e.printStackTrace();
				}

          	    //-----------------
		    break;
		}
            }
		if(!flag){
			throw new SongNotFoundException("Song kadaikala da");
		}
	}
    }
}			 
		    