class Train_Details 
{ 

void display(String arrival,String destination) 
{ 

if(arrival=="CHN" && destination=="TCR") 
System.out.println("THE AVAILABLE TRAINS ARE: 1.NELLAI EXPRESS- TRAIN ID:30001  2.KANYAKUMARAI EXPRESS- TRAIN ID:60002 ");

else if(arrival=="TCR" && destination=="MUB") 
System.out.println("THE AVAILABLE TRAINS ARE: 1.TCMU EXPRESS- TRAIN ID:300021 2.TCXM EXPRESS- TRAIN ID:60232 ");  

} 

void display(String arrival,String destination,int train_number) 
{ 
  if(arrival=="CHN" && destination=="TCR") 
  { 
    if(train_number==30001) 
    System.out.println("The seats available in this train: "+train_number+" are 30");
    else if(train_number==60002)
    System.out.println("The seats available in this train: "+train_number+" are 10"); 
  } 
  else if(arrival=="TCR" && destination=="MUB") 
  { 
    if(train_number==300021) 
    System.out.println("The seats available in this train: "+train_number+" are 25");
    else if(train_number==60232)
    System.out.println("The seats available in this train: "+train_number+" are 40"); 
  } 

}
 
void display(String arrival,String destination,int train_number,String coach) 
{ 
   if(arrival=="CHN" && destination=="TCR") 
  { 
     if(train_number==30001)  
     { 
       if(coach.equals("AC TIER")) 
       System.out.println("The seats available in this coach of train:"+train_number+" is- 11"); 
       else if(coach.equals("GENERAL"))
       System.out.println("The seats available in this coach of train:"+train_number+" is- 19");  
     } 
     else if(train_number==60002)  
     { 
       if(coach.equals("AC TIER")) 
       System.out.println("The seats available in this coach of train:"+train_number+" is- 2"); 
       else if(coach.equals("GENERAL"))
       System.out.println("The seats available in this coach of train:"+train_number+" is- 8");  
     }  
  } 

  else if(arrival=="TCR" && destination=="MUB") 
  { 
    if(train_number==300021)
    { 
      if(coach.equals("AC TIER")) 
      System.out.println("The seats available in this coach of train:"+train_number+" is 15"); 
      else if(coach.equals("GENERAL"))
      System.out.println("The seats available in this coach of train:"+train_number+" is 10"); 
    }
    else if(train_number==60232)
    {
      if(coach.equals("AC TIER")) 
      System.out.println("The seats available in this coach of train:"+train_number+" is 30"); 
      else if(coach.equals("GENERAL"))
      System.out.println("The seats available in this coach of train:"+train_number+" is 10"); 
    }
  }  
}
public static void main(String[]args)
{ 
Train_Details object=new Train_Details();

object.display("TCR","MUB");
object.display("TCR","MUB",300021); 
object.display("TCR","MUB",300021,"AC TIER");

}
}
