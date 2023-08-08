import java.io.*;
import java.text.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Function{
	public static void main(String args[]) throws Exception{
			System.out.println("Select from the below choice");
			System.out.println("1-> sort the song based on song duration");
			System.out.println("2-> sort the song based on song rating");
			System.out.println("3-> serach the song name");
			Scanner sc= new Scanner(System.in);
	
			int choice=sc.nextInt();
			List<Song> sl=new ArrayList<>();                                                                                                                      // creation of list
			sl.add(Song.SongcreateSong("hukum,pop,02:07,2.1"));
			sl.add(Song.SongcreateSong("sahana,jazz,03:07,4.1"));

			sl.add(Song.SongcreateSong("vaathi raiduu,break,04:07,1.1"));
			sl.add(Song.SongcreateSong("mersal arsan,pop,04:08,4.7"));
			sl.add(Song.SongcreateSong("dandilieons,pop,02:43,1.5"));
			switch(choice){
				case 1:
					//using collections
					Collections.sort(sl,(duaration1,duration2)->(duaration1.getduration().compareTo(duration2.getduration())));
					System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");                                                     // formatting for the output
					
					for(Song i:sl ){
						System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getgenre(),new SimpleDateFormat("mm:ss").format(i.getduration()),i.getrating());
					}
					
               			        break;
					
                		case 2:
					//using collections
                    			Collections.sort(sl,(rating1,rating2) -> (rating1.getrating().compareTo(rating2.getrating())));
					System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");                                                   // formatting for the output
					DateFormat df = new SimpleDateFormat("mm:ss");
					for(Song i:sl ){
						System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
					}
					
               			        
                    			break;
				case 3:
					
					String uname= sc.next();
					Iterator <Song> it= sl.iterator();
					int flag=0;
					while(it.hasNext()){
						Song s= it.next();
						if(s.getTitle().equals(uname)){
							flag=1;
							//System.out.println(s);
							System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
							System.out.format("%-20s %-10s %-12s %-12s\n",s.getTitle(),s.getgenre(),new SimpleDateFormat("mm:ss").format(s.getduration()),s.getrating());
							
							File file=new File("song.txt");
							try(FileOutputStream fs = new FileOutputStream(file);                                                              //serialization

                                                            ObjectOutputStream obj=new ObjectOutputStream(fs))
                                                            {
            							
            							
            							obj.writeObject(s);
								break;
	    
	
        						    }
        						   catch(Exception e)
        						   {
            							System.out.println(e);
        						   }
						}
						
					} 
					if (flag==0){
							System.out.println("not found");
					}
						
					
					
					
					
					

					
					
				
			}
			
		}
}