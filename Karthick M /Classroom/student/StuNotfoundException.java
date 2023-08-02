class StuNotfoundException extends Exception
{
    StuNotfoundException(int sid)
    {
        System.out.println(sid + "Not Present in database");
    }
}
