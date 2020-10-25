package edu.bsu.cs222;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    public void testCompareCardPoints(){
        Card card = new Card();
        Boolean result = card.compareCardPoints(1,11);
        Assertions.assertTrue(result);
    }
}
