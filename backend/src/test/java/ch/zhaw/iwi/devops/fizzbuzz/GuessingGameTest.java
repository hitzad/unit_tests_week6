package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Assertions;

public class GuessingGameTest {
    @Test
    public void GuessingGameCorrect() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist korrekt!", test.guess(10));
    }    
    
    @Test
    public void GuessingGameDefault() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist nicht die korrekte Eingabe", test.guess(11));
    }    
        
}
