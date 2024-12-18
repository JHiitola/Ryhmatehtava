import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String input = "";
        String [] apho = {
            "Actions speak louder than words.",
            "A barking dog never bites.",
            "A penny saved is a penny earned.",
            "All things come to those who wait." };
        Random random = new Random();       
        System.out.println("Pick a number from 1-4 or write 'R' for a random aphorism (or type 'exit' to quit):");
        input = in.nextLine();
        while (true) {
            
            System.out.println("Pick a number from 1-4 or write 'R' for a random aphorism (or type 'exit' to quit):");
            
            input = in.nextLine().trim();

            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break; 
            }

            
            if (input.equalsIgnoreCase("R")) {
                int randomNumber = random.nextInt(4);  
                System.out.println("You got " + (randomNumber + 1) + ":");
                System.out.println(apho[randomNumber]);
            } else {
                try {
                    int index = Integer.parseInt(input);
                    if (index >= 1 && index <= 4) {
                        System.out.println("You got " + index + ":");
                        System.out.println(apho[index - 1]);
                    } else {
                        System.out.println("Please enter a number between 1 and 4.");
                    } //tää ei toimi, tuli kiire töihin
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 4 or 'R'.");
                }
            }
        }
        in.close();
    }
    // "Uusittu" koodinpätkä 17.11. Jari H.
    // "Lisätty satunnaisen numeron arpominen 15.12. Ruut K."
    // Lisätty looppi ja exit mahdollisuus, jäi valitettavasti kesken kun tuli kiire töihin. 18.12. Valtteri
}
