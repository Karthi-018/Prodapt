class SongNotFoundException extends Exception
{
    private String songName; 

    public SongNotFoundException(String songName) 
    {
        this.songName = songName; 
    }

    @Override
    public String toString()
    {
        return songName + " not found in the List"; 
    }
}