package telephonedirectory;
import java.util.*;

public class Telephone
{
    List<TelephoneDirectory> TeleBook=new ArrayList<TelephoneDirectory>();
    static Scanner sc=new Scanner(System.in);
    void createDirectory()
    {
      TelephoneDirectory obj=new TelephoneDirectory("AAA",9346777);
      TeleBook.add(obj);
      TeleBook.add(new TelephoneDirectory("CAA",934586777));
      TeleBook.add(new TelephoneDirectory("BAA",934566453));
      TeleBook.add(new TelephoneDirectory("EEE",2122345566));
      TeleBook.add(new TelephoneDirectory("SDC",122234567));

    }

    void searchDirectory(String name)
    {   int flag=0;
        /*for(TelephoneDirectory i:TeleBook)
        {
            if(i.getName().equals(name))
            {
                System.out.println(i);
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Name not found"); */

        Iterator obj=TeleBook.iterator();
        while(obj.hasNext())
        {
            TelephoneDirectory object=(TelephoneDirectory) obj.next();
            if(object.getName().equals(name))
            {
                System.out.println(object);
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Name not found");

    }
    public static void main(String[] args)
    {
        Telephone object=new Telephone();
        System.out.println("TELEPHONE DIRECTORY");
        object.createDirectory();
        System.out.println(object.TeleBook);
        System.out.print("Enter the Name to search details:");
        object.searchDirectory(sc.next());
    }
}
