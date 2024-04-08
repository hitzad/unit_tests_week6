package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void convertToRoman_1_ReturnsI() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(1);
        assertEquals("I", result);
    }

    @Test
    public void convertToRoman_2_ReturnsII() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(2);
        assertEquals("II", result);
    }

    @Test
    public void convertToRoman_3_ReturnsIII() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(3);
        assertEquals("III", result);
    }
    @Test
    public void convertToRoman_4_ReturnsIV() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(4);
        assertEquals("IV", result);
    }
    @Test
    public void convertToRoman_5_ReturnsV() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(5);
        assertEquals("V", result);
    }
    @Test
    public void convertToRoman_6_ReturnsVI() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(6);
        assertEquals("VI", result);
    }
    @Test
    public void convertToRoman_7_ReturnsVI() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(7);
        assertEquals("VII", result);
    }
    @Test
    public void convertToRoman_8_ReturnsVIII() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(8);
        assertEquals("VIII", result);
    }
    @Test
    public void convertToRoman_9_ReturnsIX() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(9);
        assertEquals("IX", result);
    }
    @Test
    public void convertToRoman_10_ReturnsX() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(10);
        assertEquals("X", result);
    }    

}