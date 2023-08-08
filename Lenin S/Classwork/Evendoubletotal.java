//package:

import java.util.*;

class Evendoubletotal

{

public static void main(String[] args)

{

int totalsum = 0;

//arraylist:-

ArrayList<Integer> Even = new ArrayList<>();

for(int i=0;i<50;i++)

{

//initialising values from 1 to 50:-

Even.add(i); 

}

for(int i=0; i<50; i++)

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


