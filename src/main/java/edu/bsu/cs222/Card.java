package edu.bsu.cs222;
//The class is in the test process
public class Card {
    String suits[] = {"Heart", "Diamond", "Club", "Spade"};
    String points[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    //JSONObject json = JSONObject.fromObject(str);
    //Not sure if we need to use Json

    public int transformCardPoint (String randomPoint){
        // remember to replace the randomPoint with random method
        if(randomPoint.equals("3")) {
            return 3;
        } else if(randomPoint.equals("4")){
            return 4;
        }else if(randomPoint.equals("5")){
            return 5;
        }else if(randomPoint.equals("6")){
            return 6;
        }else if(randomPoint.equals("7")){
            return 7;
        }else if(randomPoint.equals("8")){
            return 8;
        }else if(randomPoint.equals("9")){
            return 9;
        }else if(randomPoint.equals("10")){
            return 10;
        }else if(randomPoint.equals("A")) {
            return 1;
        }else{
            return 11;
        }
    }

    public String compareCardPoints(int firstCardNum, int secondCardNum) {
        //remember to replace the int
        // with computer card and player card
        if (firstCardNum > secondCardNum){
            return "Bigger";
        }else if(firstCardNum < secondCardNum){
            return "Smaller";
        }else {
            return "Same";
        }
    }
}
