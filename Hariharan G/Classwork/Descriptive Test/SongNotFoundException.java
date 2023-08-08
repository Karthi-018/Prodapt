class SongNotFoundException extends Exception
{
	SongNotFoundException()
	{
	System.out.println("Song not found in the database!");
	}
}