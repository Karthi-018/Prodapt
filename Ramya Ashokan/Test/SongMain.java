import java.util.*;
import java.text.*;
import java.io.*;
class SongMain 
{
public static void main(String []args)throws Exception
{


Scanner sc=new Scanner(System.in);
List <Song> l=new ArrayList<>();
try
{

l.add(Song.createSong("Ranjithamae,folk,04:50,4.5"));
l.add(Song.createSong("Innisai,melody,05:00,4.2"));
l.add(Song.createSong("Ayarpadil,devotion,04:20,5"));
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("1.Sort by duration\n2.Sort by rating\n3.search by Song name\nEnter the choice");
int choice=sc.nextInt();
switch(choice)
{
case 1:
 Collections.sort(l,(t1, t2) -> (t1.getDuration().compareTo(t2.getDuration())));
System.out.format("%-15s %-20s %-12s %-12s\n","Title","Genre","Duration","Rating");
for(Song s: l)
{
DateFormat df=new SimpleDateFormat("mm:ss");
System.out.format("%-15s %-20s %-12s %-12s\n",s.getTitle(),s.getGenere(),df.format(s.getDuration()),s.getRating());
}
 break;

case 2:
Collections.sort(l,(t1, t2) -> (t1.getRating()<t2.getRating())?-1:(t1.getRating()>t2.getRating())?1:0);
System.out.format("%-15s %-20s %-12s %-12s\n","Title","Genre","Duration","Rating");
for(Song s: l)
{
DateFormat df=new SimpleDateFormat("mm:ss");
System.out.format("%-15s %-20s %-12s %-12s\n",s.getTitle(),s.getGenere(),df.format(s.getDuration()),s.getRating());
			
}
 break;
case 3:
System.out.println("Enter name to search");
boolean flag=false;
String search=sc.next();
File file=new File("music.txt");
try(FileOutputStream fs=new FileOutputStream(file,true);ObjectOutputStream os=new ObjectOutputStream(fs);)
{
for(Song l1:l)
{
if(l1.getTitle().equals(search))
{
System.out.println("Search song found");
System.out.format("%-15s %-20s %-12s %-12s\n","Title","Genre","Duration","Rating");
DateFormat df=new SimpleDateFormat("mm:ss");
System.out.format("%-15s %-20s %-12s %-12s\n",l1.getTitle(),l1.getGenere(),df.format(l1.getDuration()),l1.getRating());
os.writeObject(l1);
flag=true;
break;
}
}
if(flag==false)

throw new SongNotFoundException(search);
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}}

