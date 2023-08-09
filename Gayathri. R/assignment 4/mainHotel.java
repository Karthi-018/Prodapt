import java.util.*;
class mainHotel
{
 public static void main(String a[]) throws Exception
{
Scanner s=new Scanner(System.in);
ArrayList<pojoHotel> data=new ArrayList<>();
System.out.println("enter how many hotels ");
	int no=s.nextInt();
	
	for(int i=0;i<no;i++)
	{
                pojoHotel hotel=new pojoHotel();
		System.out.println("enter the id,name,facility,description,ratings seperated by comma");
		String line=s.next();
                
		pojoHotel o=new pojoHotel();
		o=pojoHotel.createdata(line);//passing the line to createsong method
		data.add(o);
		
	}
	

	
		
	//System.out.println(data);
	System.out.println("enter choice to perform the following operations\n1.sort list based on hotel Name .\n2.sort list based on hotel rating.\n3.To search   a hotel from the data");
	
 	int choice=s.nextInt();
		
		switch(choice)
		{
			 case 1 : data.sort((t1, t2) -> (t1.getname().compareTo(t2.getname())));
			 for(pojoHotel obj:data)
				{
			         
                                 System.out.println(obj);
				}
                         break;
		         case 2: data.sort((t3,t4)->(t3.getrating()>t4.getrating())? 1:(t3.getrating()<t4.getrating())?-1:0);
			 data.forEach(System.out::println);
			 break;
                         case 3:
 				String sname=s.next();
				int temp=0;
				
			 		for(pojoHotel obj:data)
			 		{
					if(sname.equals(obj.getname()))
						{System.out.println(obj);
						 temp=1;
						}
					}
				if(temp==0)
				{throw new HotelNotFoundException(sname);}
					
				
			         break;
				
 				
							
			 
		}
				
}
}
