package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GuessingGameTest {
    @Test
    public void GuessingGameCorrect() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist korrekt!", test.guess(10));
    }    
    
    @Test
    public void GuessingGameToohigh() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Deine Schätzung ist zu hoch", test.guess(13));
    }

    @Test
    public void GuessingGameToolow() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Deine Schätzung ist zu tief", test.guess(2));
    }

    @Test
    public void GuessingGameNotvalid() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Die Eingabe muss eine Zahl wischen 1 und 100 sein", test.guess(-1));
    }

    @Test
    public void GuessingGameOver100() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Die Eingabe muss eine Zahl wischen 1 und 100 sein", test.guess(234));
    }

    @Test
    public void GuessingGameOver50() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Deine Eingabe ist viel zu hoch", test.guess(51));
    }

    @Test
    public void GuessingGameOne() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Mach es dir nicht so einfach", test.guess(1));
    }

    @Test
    public void GuessingGameNine() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Du bist sehr nahe dran!", test.guess(9));
    }

    @Test
    public void GuessingGameEight() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Du bist nahe dran!", test.guess(8));
    }

/* 
    @Test
    public void GuessingGameDefault() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist nicht die korrekte Eingabe", test.guess(345));
    }  
*/
}
