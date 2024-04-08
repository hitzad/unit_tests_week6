package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public String convertToRoman(int number) {
        String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romanNumerals[number];
    }     
}
