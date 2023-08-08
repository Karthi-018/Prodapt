class SongNotFoundException extends Exception
{
SongNotFoundException(String sname)
{
System.out.println(sname+" "+"song not found in the list");
}
}