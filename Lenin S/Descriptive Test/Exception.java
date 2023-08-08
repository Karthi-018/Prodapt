class SongNotFoundException extends Exception
{
	SongNotFoundException(String name)
	{
		System.out.println(name+" is not found");
	}
}
