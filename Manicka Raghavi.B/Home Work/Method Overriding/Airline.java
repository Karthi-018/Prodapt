class XYZ_Airline 
{ 
void meals() 
{ 
System.out.println("THE MEALS PROVIDED IN THE XYZ AIRLINES ARE: 1.Welcome Drinks 2.Snacks 3.Meals( Non veg and Veg) \n");
} 
}

class Buisness_Class extends XYZ_Airline
{ 
 void meals() 
{ 
System.out.println("THE MENU OF BUISNESS CLASS IS:\n 1.DRINKS-Coffee,Tea,Fresh Juice,Cocktails,Spirit \n 2.APPETIZERS-Baked Breads,Fresh Fruits,Youghurt,Soups\n 3.MEAL-Pasta,Meat(For Non Veg),Veg Patti(For Veg),Airline Special food,Rice,Curry \n 4.DESSERTS- Ice cream,Muffins,Chocolates,Processed Cheese,Candy");

}
} 

class Economy_Class extends XYZ_Airline
{ 
 void meals() 
{ 
System.out.println("THE MENU OF ECONOMY CLASS IS:\n 1.DRINKS-Coffee,Tea,Aerated Drinks \n 2.APPETIZERS-Biscuits,Packaged Salads,Bread Butter \n 3.MEAL-Meat(For Non Veg),Veg Patti(For Veg),Curry,Rice \n 4.DESSERTS- Muffins,Chocolates");

}
}

class Airline
{ 
public static void main(String[] args) 
{ 

XYZ_Airline ob=new XYZ_Airline();
ob.meals();

//method overriding
Buisness_Class object=new Buisness_Class();
object.meals(); 
  
System.out.println("-----------------------------------------------------------------------------------------------------");

Economy_Class obj=new Economy_Class();
obj.meals(); 

}
}