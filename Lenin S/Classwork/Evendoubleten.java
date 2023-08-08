//package:

import java.util.*;

class Evendoubleten

{

public static void main(String[] args)

{

int totalsum = 0;
Scanner s = new Scanner(System.in);

//arraylist:-

ArrayList<Integer> Even = new ArrayList<>();

for(int i=0;i<10;i++)

{

//initialising values from 1 to 10:-

Even.add(s.nextInt()); 

}

for(int i=0; i<10; i++)

{

if(Even.get(i)%2==0)

{

//get incremented values, mul with 2 and store it in the totalsum loaction:-

totalsum =totalsum + Even.get(i)*2;

}

}

System.out.println("the total sum is: " +totalsum);


}

}


