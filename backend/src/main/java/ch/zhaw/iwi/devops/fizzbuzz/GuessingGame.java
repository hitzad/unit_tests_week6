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

        else if (number < 10 && number >= 0) {
            return "Deine Schätzung ist zu tief";
        }

        else if (number < 0) {
            return "Die Eingabe muss eine Zahl wischen 1 und 100 sein";
        }

        return "Das ist nicht die korrekte Eingabe";
    }

}
