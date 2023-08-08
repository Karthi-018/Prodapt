class SongNotFoundException extends Exception
{
    SongNotFoundException(String title)
{
    System.out.println(title + " not found");
}

}