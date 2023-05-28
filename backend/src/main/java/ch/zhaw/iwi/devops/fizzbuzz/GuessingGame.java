package ch.zhaw.iwi.devops.fizzbuzz;

public class GuessingGame {
    public String guess(int number) {
        System.out.println("Dein Guess ist" +number);
        if (number == 10){
            return "Das ist korrekt!";
        }
        else if (number > 10 && number <= 50){
            return "Deine Schätzung ist zu hoch";
        }

        else if (number < 10 && number >= 2) {
            return "Deine Schätzung ist zu tief";
        }

        else if (number < 0) {
            return "Die Eingabe muss eine Zahl wischen 1 und 100 sein";
        }

        else if (number > 100) {
            return "Die Eingabe muss eine Zahl wischen 1 und 100 sein";
        }

        else if (number > 50) {
            return "Deine Eingabe ist viel zu hoch";
        }

        else if (number == 1) {
            return "Mach es dir nicht so einfach";
        }

        return "Das ist nicht die korrekte Eingabe";
    }

}
