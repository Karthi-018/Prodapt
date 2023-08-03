package org.example.collections;
import java.util.*;
public class MainDirectory
{

    public static void phoneBook()
    {
        Scanner s = new Scanner(System.in);
        List<Directory> pb = new ArrayList<>();
        pb.add(new Directory(9705, "ABC"));
        pb.add(new Directory(8609, "DEF"));
        pb.add(new Directory(7856, "KDH"));
        pb.add(new Directory(9275, "BLX"));
        pb.add(new Directory(8479, "SFV"));
        pb.add(new Directory(7534, "YKD"));
        pb.add(new Directory(6364, "YJM"));
        pb.add(new Directory(6271, "AET"));
        pb.add(new Directory(9124, "MMD"));
        String name=s.next();
        Iterator<Directory> i= pb.iterator();
        while(i.hasNext())
        {
            Directory n=i.next();
            if (n.getPname().equals(name))
            {
                System.out.println(n.getPnum());
                return;
            }
        }
        System.out.println("DATA DOES NOT EXIST");
    }

    public static void main(String args[])
    {
        phoneBook();
    }


}
