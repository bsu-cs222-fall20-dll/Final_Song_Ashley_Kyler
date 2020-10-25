package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//All failed aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
public class CardTest {
    @Test
    public void testTransformCardJNum(){
        Card card = new Card();
        Assertions.assertEquals(11, card.transformCardPoint("J"));
    }

    @Test
    public void testTransformCardQNum(){
        Card card = new Card();
        Assertions.assertEquals(11, card.transformCardPoint("Q"));
    }

    @Test
    public void testTransformCardKNum(){
        Card card = new Card();
        Assertions.assertEquals(11, card.transformCardPoint("K"));
    }

    @Test
    public void testTransformCardANum(){
        Card card = new Card();
        Assertions.assertEquals(1, card.transformCardPoint("A"));
    }

    @Test
    public void testTransformCard10Num(){
        Card card = new Card();
        Assertions.assertEquals(10, card.transformCardPoint("10"));
    }

    @Test
    public void testCompareCardPointsSmaller(){
        Card card = new Card();
        String result = card.compareCardPoints(1, 11);
        Assertions.assertEquals("Smaller", result);
    }

    @Test
    public void testCompareCardPointsBigger(){
        Card card = new Card();
        String result = card.compareCardPoints(11, 1);
        Assertions.assertEquals("Bigger", result);
    }

    @Test
    public void testCompareCardPointsSame(){
        Card card = new Card();
        String result = card.compareCardPoints(11, 11);
        Assertions.assertEquals("Same", result);
    }
}
