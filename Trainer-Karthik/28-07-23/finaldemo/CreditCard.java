package org.example.finaldemo;

public class CreditCard {
    String cardType;
    final long CARD_NUMBER;

    public CreditCard(String cardType, long CARD_NUMBER) {
        this.cardType = cardType;
        this.CARD_NUMBER = CARD_NUMBER;
    }

    void cardDetails()
    {
        System.out.println("Card Type is "+cardType);
        System.out.println("Card Number is "+CARD_NUMBER);
    }

    public static void main(String[] args) {

        CreditCard visaCard = new CreditCard("VISA",12345698701234l);

        visaCard.cardDetails();

        CreditCard masterCared = new CreditCard("MASTER",123456);

        masterCared.cardDetails();
    }
}
