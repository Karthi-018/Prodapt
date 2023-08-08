class SongNotFoundException extends Exception
{
SongNotFoundException(String name)
{
System.out.println("Song Not Found");
}
}