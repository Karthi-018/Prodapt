// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;


import java.io.*;
class Emp implements Serializable{
    public String name;
    public int id;
    public String location;
}
public class SerializationMain{
    public static void main(String[] args) {
        Emp emp=new Emp();
        emp.name="Sneha";
        emp.id=101;
        emp.location="Chennai";
        try(FileOutputStream fout=new FileOutputStream("hello.txt");
            ObjectOutputStream objt=new ObjectOutputStream(fout);){
                objt.writeObject(emp);
          
        }
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e)
        {
        e.printStackTrace();
        }
    }
}