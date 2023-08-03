import java.io.*;
public class FileDemo {
    public static void main(String[] args) throws Exception {
        //write a data in file
        FileOutputStream fos = new FileOutputStream("Demo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo the program hello");
        //read a data from file
        FileInputStream fis = new FileInputStream("Demo.txt");
        DataInputStream dis = new DataInputStream(fis);
        String data=dis.readUTF();
        System.out.println(data);
    }
}
