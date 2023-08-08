package songs;

class SongNotFoundException extends Throwable 
{

String title;
 
SongNotFoundException(String title)
{ 
this.title=title;
}

public String toString() 
{ 

return "The "+title+" not found the music list";

}

}