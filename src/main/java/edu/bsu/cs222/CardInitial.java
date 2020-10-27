package edu.bsu.cs222;

public class CardInitial {
    private String suits;
    private String cardNumbers;
    public int point;

    public CardInitial(String suits, String cardNumbers) {
        this.suits = suits;
        this.cardNumbers = cardNumbers;
        if(cardNumbers== "J" || cardNumbers == "Q" || cardNumbers == "K") {
            this.point = 10;
        } else if(cardNumbers == "A") {
            this.point = 1;
        } else {
            this.point = Integer.parseInt(cardNumbers);
        }
    }

    public String getSuits() {
        return suits;
    }

    public String getCardNumbers() {
        return cardNumbers;
    }

    public int getPoint() {
        return point;
    }

    public void displayNewCard() {
        System.out.print("Suit" + suits);
        System.out.print("CardNumber" + cardNumbers);
        System.out.println("Point" + point);
    }
}
