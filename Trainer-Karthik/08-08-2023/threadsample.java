public class threadsample
{
     int count=0;
    public synchronized void getCount()
    {
        for(int i=0;i<100000;i++)
        {
            count++;

        }
    }
}
