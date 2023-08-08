import java.io.*;
import java.text.*;
import java.util.*;
class mainsong implements Serializable
{
public static void main(String a[]) throws Exception
{
	Scanner s=new Scanner(System.in);
	ArrayList<song> data=new ArrayList<>();
	System.out.println("enter how many songs ");
	int noS=s.nextInt();
	try{
	for(int i=0;i<noS;i++)
	{
                song Song=new song();
		System.out.println("enter the title,genre,duration,rating of the song seperated by comma");
		String line=s.next();
                
		song o=new song();
		o=Song.createsong(line);//passing the line to createsong method
		data.add(o);
		
	}
	}

	catch(Exception e)
	{
	System.out.println(e);
	}
		
	System.out.println(data);
	System.out.println("enter choice to perform the following operations\n1.sort list based on duration.\n2.sort list based on song rating.\n3.To search   a song from the list");
	
 	int choice=s.nextInt();
		
		switch(choice)
		{
			 case 1 : data.sort((t1, t2) -> (t1.getduration().compareTo(t2.getduration())));
			 for(song obj:data)
				{
			         DateFormat df=new SimpleDateFormat("MM:SS");
                                 System.out.println(obj);
				}
                         break;
		         case 2: data.sort((t3,t4)->(t3.getrating()>t4.getrating())? 1:(t3.getrating()<t4.getrating())?-1:0);
			 data.forEach(System.out::println);
			 break;
                         case 3:
 				String sname=s.next();
				int temp=0;
				File fs=new File("songlist.txt");
				try(
		                 FileOutputStream fos = new FileOutputStream(fs);
		                  ObjectOutputStream oos = new ObjectOutputStream(fos);) 
					{
			 		for(song obj:data)
			 		{
					if(sname.equals(obj.gettitle()))
						{System.out.println(obj);
						 oos.writeObject(obj); 
						 temp=1;
						}
					}
				if(temp==0)
				{throw new SongNotFoundException(sname);}
					}
				catch(Exception e)
			        {
				System.out.println(e);
			        }
			break;
				
 				
							
			 
		}
				
}
}
			
	