import java.util.*;
import java.io.*;
import java.text.*;
class Main{
	static ArrayList<Song> songs = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SongNotFoundException,IOException,ParseException{
		Song s1 = new Song();
		songs.add(s1.createSong("SONG1,LOVE,04:34,5.0"));
		Song s2 = new Song();
		songs.add(s2.createSong("SONG2,POP,03:24,4.0"));
		Song s3 = new Song();
		songs.add(s3.createSong("SONG3,LOVE,00:34,3.0"));
		Song s4 = new Song();
		songs.add(s4.createSong("SONG4,LOVE,01:34,3.0"));
		int choice  = 0;
		System.out.println(songs);
		System.out.println("Enter no of songs :");
		int n = sc.nextInt();
		while(n-->0){
			String title = sc.next();
			songs.add(new Song().createSong(title));
		}
		while(choice !=4 ){

			System.out.println("1.SORT SONG BASED ON DURATION ");
			System.out.println("2.SORT SONG BASED ON RATING ");
			System.out.println("3.SEARCH SONG BASED ON NAME ");
			System.out.println("4.EXIT ");
		
			choice = sc.nextInt();
			switch(choice){
				case 1 : 
					ArrayList<Song> songList1 = songs;
					Set<Date> durations1 = new LinkedHashSet<>();
					Collections.sort(songList1,(Song ss1,Song ss2)->{
							return ss1.getDuration().compareTo(ss2.getDuration());
						}
					);
					ArrayList<Song> newList1 = new ArrayList<>();
					for(Song s : songList1){
						int i1 = durations1.size();
						durations1.add(s.getDuration());
						int i2 = durations1.size();
						if(i1!=i2){
							newList1.add(s);
						}
					}
                                        System.out.format("%-20s %-10s %-12s %-12s\n","TITLE", "GENRE", "DURATION", "RATING");
					DateFormat df=new SimpleDateFormat("mm:ss");
					for(int i=0;i<newList1.size();i++){
					    
					    System.out.format("%-20s %-10s %-12s %-12s\n",newList1.get(i).getTitle(),newList1.get(i).getGenre(),df.format(newList1.get(i).getDuration()),newList1.get(i).getRating());
                                        }
					break;

				case 2 :	
					ArrayList<Song> songList = songs;
					Set<Double> ratings = new LinkedHashSet<>();
					Collections.sort(songList,(Song ss1,Song ss2)->{
							if(ss1.getRating()<ss2.getRating()){	
								return -1;
							}
							else{
								return 1;	
							}
						}
					);
					ArrayList<Song> newList = new ArrayList<>();
					for(Song s : songList){
						int i1 = ratings.size();
						ratings.add(s.getRating());
						int i2 = ratings.size();
						if(i1!=i2){
							newList.add(s);
						}
					}

					DateFormat df=new SimpleDateFormat("mm:ss");
					System.out.format("%-20s %-10s %-12s %-12s\n","TITLE", "GENRE", "DURATION", "RATING");
					for(int i=0;i<newList.size();i++){
					   
					    System.out.format("%-20s %-10s %-12s %-12s\n",newList.get(i).getTitle(),newList.get(i).getGenre(),df.format(newList.get(i).getDuration()),newList.get(i).getRating());
                                        }
					break;
				case 3 :
					System.out.println("Enter song name : ");
					String name = sc.next();
					boolean flag = false;
					for(Song s :songs){
						if(s.getTitle().equals(name)){
							flag = true;
							System.out.println(s);
							
							FileWriter fw = new FileWriter("hi.txt");
							fw.write(s.toString());
							fw.close();
							break;
						}
					}
					if(!flag){
						throw new SongNotFoundException("No song found with name : "+name);
					}
					break;
				case 4 : 
					break;
				default:
					System.out.println("Wrong option try again");
			}
		}
		System.out.println("Tata byeeee");	
		
	}
}
