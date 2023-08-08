import java.text.*;
import java.util.*;
import java.io.*;

class mainclass {

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		List<Song> data=new ArrayList<>();
		
		data.add(Song.createSong("aaa,pop,4:04,7"));
		data.add(Song.createSong("bbb,pop,3:04,10"));
		data.add(Song.createSong("cxa,jazz,2:00,8"));
		
		
		System.out.println("1->Sort songs based on duration");
		System.out.println("2->Sort songs based on rating");
		System.out.println("3->Search song");

		System.out.println("Enter your choice");
		int choice=sc.nextInt();
	
		switch(choice)
		{
		
			case 1:
				data.sort((s1,s2)-> ((s1.getduration().compareTo(s2.getduration()))));
				System.out.format("%-20s %-10s %-12s %-12s\n","title","genre","duration","rating");
				for(Song i:data){
					DateFormat df= new SimpleDateFormat("mm:ss");
					System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
				}
				break;
			case 2:
				data.sort((s1,s2)-> ((s1.getrating()>s2.getrating())?1:(s1.getrating()<s2.getrating())?-1:0));
				System.out.format("%-20s %-10s %-12s %-12s\n","title","genre","duration","rating");
				for(Song i:data){
					DateFormat df= new SimpleDateFormat("mm:ss");
					System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
				}
				
				break;
			case 3:
				System.out.println("Enter song name:");
				String sname=sc.next();
				boolean flag=false;
				File f=new File("song.txt");
				try(FileOutputStream fos=new FileOutputStream(f);
					ObjectOutputStream oos=new ObjectOutputStream(fos);)
				{
				
				for(Song i:data){
				if(sname.equals(i.gettitle())){
					System.out.println(i);
					flag=true;
					oos.writeObject(i);
					break;
					}}
				if(flag==false){
					throw new SongNotFountException(sname);
					}}
				catch(Exception e){
					System.out.println(e);
					}
				
				
				break;
				
				
				
		}

		

}}