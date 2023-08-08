import java.util.*;
import java.io.*;
import java.util.Date;
import java.text.*;
class Song_main implements Serializable
{
public static void main(String args[]) throws Exception
{

Scanner s=new Scanner(System.in);
ArrayList<Song>data=new ArrayList<>();
System.out.println("Enter the number of songs");
int num=s.nextInt();
try{
for(int i=0;i<num;i++)
{
System.out.println("Enter the title,genre,duration,rating of the song seperated by comma");
String line=s.next();
Song S=new Song();
S=Song.createSong(line);
data.add(S);
}
System.out.println(data);
}
catch(Exception e)
{
System.out.println(e);
}

System.out.println("1-> Sort the Songlist based on duration");
System.out.println("2-> Sort the Songlist based on rating");
System.out.println("3-> Search the Songlist based on name");
System.out.println("Enter the choice");
int n=s.nextInt();
switch (n)
{
case 1: data.sort((t1,t2)->(t1.getduration().compareTo(t2.getduration())));
System.out.format("%-15s %-20s %-12s %-12s\n","title","genre","duration","rating");
for(Song tit: data)
{
DateFormat df=new SimpleDateFormat("mm:ss");
System.out.format("%-15s %-20s %-12s %-12s\n",tit.gettitle(),tit.getgenre(),df.format(tit.getduration()),tit.getrating());
}
break;
case 2:
//Collections.sort(data,Comparator.comparing(Song::getrating));
data.sort((t1,t2)->((t1.getrating()<(t2.getrating()))?-1:(t1.getrating()>(t2.getrating()))?1:0));
System.out.format("%-15s %-20s %-12s %-12s\n","title","genre","duration","rating");
for(Song tit:data)
{
System.out.format("%-15s %-20s %-12s %-12s\n",tit.gettitle(),tit.getgenre(),new SimpleDateFormat("mm:ss").format(tit.getduration()),tit.getrating());
}
break;
case 3:
System.out.println("Enter the Song name to be searched");
String name=s.next();
File file=new File("Songs.txt");
try(
FileOutputStream fos = new FileOutputStream(file);
ObjectOutputStream oos = new ObjectOutputStream(fos);) 
{
int flag=0;
for(Song tit:data)
{
if(name.equals(tit.gettitle()))
{
System.out.println(tit);
System.out.format("%-15s %-20s %-12s %-12s\n","title","genre","duration","rating");

System.out.format("%-15s %-20s %-12s %-12s\n",tit.gettitle(),tit.getgenre(),new SimpleDateFormat("mm:ss").format(tit.getduration()),tit.getrating());

oos.writeObject(tit); 
flag=1; 
break;
}
}
if(flag==0)
throw new SongNotFoundException(name);
}
catch(IOException e)
{
System.out.println(e);
}
}
}
}

 




