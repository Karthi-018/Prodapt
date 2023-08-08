public class SongNotFoundException extends Exception
{
	public SongNotFoundException(String songname)
		{
			System.out.println(songname + "not found in the list");	
		}
}