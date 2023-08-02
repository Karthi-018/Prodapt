class UserdefinedException extends Exception
{
UserdefinedException(int searchid)
{
    System.out.println(searchid+"Searching student is not found");
}
}