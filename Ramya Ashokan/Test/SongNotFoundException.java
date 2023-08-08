class SongNotFoundException extends Exception
{
SongNotFoundException(String s)
{
System.out.println(s+ " not in the list");
}
}