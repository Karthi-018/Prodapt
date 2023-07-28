package hello;
import java.util.*;
class CreditCard
{
String cardType;
final int cardNumber;                            //final attribute cannot be changed once it is initialised i.e., final int cardNo=12244;
CreditCard(String cardType,int cardNumber)
{
this.cardType=cardType;
this.cardNumber=cardNumber; 
}
public static void main(String args[])
{
CreditCard cc=new CreditCard("VISA",124567);

System.out.println(cc.cardType);
cc.cardType="MASTER";
System.out.println(cc.cardType);
System.out.println(cc.cardNumber);
//cc.cardNumber=132588;                              //error final attribute value cannot be assigned after initialisation.
System.out.println(cc.cardNumber);                 //error  

}


}