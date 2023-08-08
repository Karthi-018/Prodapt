public class SongNotFoundException extends Exception{

    public SongNotFoundException(String searchName)
    {
        System.out.println(searchName+" not found in the List");
    }
}