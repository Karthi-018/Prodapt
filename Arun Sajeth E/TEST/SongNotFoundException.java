package songs;

public class SongNotFoundException extends Exception
{
	public SongNotFoundException(String name)
	{
		System.out.println(name+" not found.");
	}
}