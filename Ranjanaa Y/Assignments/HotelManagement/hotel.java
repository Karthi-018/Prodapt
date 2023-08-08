import java.util.*;
class hotel 
{
    public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        ArrayList<hotelPojo> h = new ArrayList<>();
		
		hotelPojo h1 = new hotelPojo(1,"A2B","Family Restraurant","Ac dining",7);
		hotelPojo h2 = new hotelPojo(2,"Fazari","Family Restraurant & party","Ac dining & rooms",8);
		hotelPojo h3 = new hotelPojo(1,"Buhari","Family Restraurant & Roof top","Ac dining & parking",9);
		hotelPojo h4 = new hotelPojo(1,"Daalchini","Family Restraurant & gettogether meetings","Ac dining & non-Ac",7);
		hotelPojo h5 = new hotelPojo(1,"smokehub","Party and dining","rooms deluxe & nondeluxe",8);
        
        h.add(h1);
        h.add(h2);
        h.add(h3);
        h.add(h4);
        h.add(h5);
		
		
		int choice=0;
		while(choice!=4)
		{
		System.out.println("Enter 1 to sort by name: ");
        System.out.println("Enter 2 to sort by rating: ");
		System.out.println("Enter 3 to search by name: ");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
        switch(choice)
		{
			case 1:
			h.sort((t1,t2)->t1.getName().compareTo(t2.getName()));
			h.forEach(System.out::println);
			break;
			
			case 2:
			h.sort((t1,t2)-> (t1.getRate()<t2.getRate())? -1:(t1.getRate()>t2.getRate())? 1:0);
			h.forEach(System.out::println);
			break;
			
			case 3:
			System.out.println("Enter hotel name to search: ");
			String uname = sc.next();
			boolean flag=false;
			for(hotelPojo i : h)
			{
				if(uname.equals(i.getName()))
				{
					System.out.println(i);
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				throw new HotelNotFoundException(uname);
			}
			case 4:
			System.exit(0);
			break;
		}
	}

	}
	}