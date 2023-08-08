
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class HotelMain
{

    public static void main(String[] args) throws HotelNotFoundException
    {
        List<Hotel> hArr = new ArrayList<>();
        hArr.add(new Hotel("aaa","5 star hotel","101","5"));
        hArr.add(new Hotel("ddd","4 star hotel","102","5.5"));
        hArr.add(new Hotel("fff","3 star hotel","103","4"));
        hArr.add(new Hotel("fff","2 star hotel","104","2"));
        hArr.add(new Hotel("bbb","0 star hotel","105","4.5"));
        hArr.add(new Hotel("kkk","1 star hotel","106","3"));

        Scanner s=new Scanner(System.in);


        System.out.println("1.Sort the hotels based on name");
        System.out.println("2.Sort the hotels based on ratings");
        System.out.println("3.Search the hotel byt names");
        System.out.println("Enter your option: ");
        int choice = s.nextInt();


        switch(choice)
        {
            case 1:

               hArr.sort((h1,h2) ->(h2.gethName().compareTo(h1.gethName())));

			hArr.forEach(System.out::println);
			break;

            case 2:

                hArr.sort((h1,h2) ->(h2.getRating().compareTo(h1.getRating())));
			
			hArr.forEach(System.out::println);
			break;

            case 3:

                System.out.println("Enter a Hotel name to search");
                String hotel = s.next();
                int flag=0;

                Iterator<Hotel> i =hArr.iterator();
                while(i.hasNext())
                {
                    Hotel h = i.next();
                    if (h.gethName().equals(h))
                    {
                        System.out.println(h);
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    try
                    {
                        throw new HotelNotFoundException(hotel);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }



        }

    }
}