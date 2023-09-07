package org.example.finaldemo;

public class CreditCard{
String cardType;
final long CARD_NUMBER;
public CreditCard(String cardType, long CARD_NUMBER){
    this.cardType = cardType;
    this.cardNumber = CARD_NUMBER;
}
void cardDetails(String cardType,int cardNumber)
{
    System.out.println("Card Type is "+cardType);
    System.out.println("Card Number is "+CARD_NUMBER);

}
public static void main(String[] args) {
    CreditCard visaCard = new CreditCard(cardType:"VISA",CARD_NUMBER:12345677l);
    visaCard.cardDetails();
    CreditCard masterCard = new CreditCard(cardType:"MASTER",CARD_NUMBER:16277338);
    
}