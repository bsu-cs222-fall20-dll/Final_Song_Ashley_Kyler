package edu.bsu.cs222;

public class CardInitial {
    private final String suits;
    private final String cardNumbers;
    public int point;

    public CardInitial(String suits, String cardNumbers) {
        this.suits = suits;
        this.cardNumbers = cardNumbers;
        if(cardNumbers.equals("J") || cardNumbers.equals("Q") || cardNumbers.equals("K")) {
            this.point = 10;
        } else if(cardNumbers.equals("A")) {
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
        System.out.print(suits + " " + cardNumbers);
        System.out.println();
    }
}
