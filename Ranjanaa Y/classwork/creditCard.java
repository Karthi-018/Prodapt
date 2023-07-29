class creditCard
{
String cardType;
final int cardNum; // final value can be defined here else in constructor

creditCard(String cType,int cNum)
{
cardType = cType;
cardNum = cNum; 
System.out.println(cardType);
System.out.println(cardNum);
}

public static void main(String args[])
{
creditCard cc = new creditCard("visa",1224);
cc.cardType = "master";
// cc.cNum = 673728;  ----> Error 

}
}