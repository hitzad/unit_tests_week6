package ch.zhaw.iwi.devops.fizzbuzz;

public class GuessingGame {
    public String guess(int number) {
        System.out.println("Dein Guess ist" +number);
        if (number == 10){
            return "Das ist korrekt!";
        }
        else if (number > 10){
            return "Deine Schätzung ist zu hoch";
        }
        return "Das ist nicht die korrekte Eingabe";
    }

}
