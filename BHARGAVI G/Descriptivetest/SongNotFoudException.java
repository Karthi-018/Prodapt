public class SongNotFoudException extends Exception{

 

    public SongNotFoudException(String songname)
    {
        System.out.println(songname+" not found in the List");
    }
}