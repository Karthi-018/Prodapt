import java.io.*;
class FileHandling
{

 

 

    public static void main(String[] args)
    {

 

        try(FileWriter fs = new FileWriter("file.txt");
        BufferedWriter bs = new BufferedWriter(fs);
    FileReader fr=new FileReader("file.txt");
    BufferedReader br = new BufferedReader(fr);)
        {
            String s = "hii";
            byte[] arr = s.getBytes();
            //bs.write(s);
        System.out.println(br.read());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}