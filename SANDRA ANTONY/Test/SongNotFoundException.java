public class SongNotFoundException extends Exception
{
    SongNotFoundException(String title)
    {
        System.out.println("Song Title "+title+" not found.");
    }
}