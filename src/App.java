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
        System.out.println("Pick number from 1-4 or write 'R' for a random number");
        input = in.nextLine();
        if (input.equalsIgnoreCase("R"))
        {
            int randomNumber = random.nextInt(4) + 1;
            System.out.println("You got " + randomNumber + ":");
            System.out.println(apho[randomNumber - 1]);
        } else{
        System.out.println(apho[Integer.parseInt(input)-1]);
        }           
    }
    // "Uusittu" koodinpätkä 17.11. Jari H.
    // "Lisätty satunnaisen numeron arpominen 15.12. Ruut K."
}

