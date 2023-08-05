import java.io.*;

public class DeserializationMain{

    public static void main(String[] args) throws Exception  {
        Emp emp=null;
        try(FileInputStream fin=new FileInputStream("D:\\Java_Prog\\io\\Emp1\\hello.txt");
        ObjectInputStream objt=new ObjectInputStream(fin);){
            emp=(Emp)objt.readObject();
        }
        finally{
            System.out.println("Deserializing Employee");
            System.out.println(emp.name+"\n"+emp.id+"\n"+emp.location);
            
        }
    
    }
    
}
