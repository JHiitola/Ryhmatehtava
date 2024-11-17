import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        String input = "";
        String [] apho = {
            "Actions speak louder than words.",
            "A barking dog never bites.",
            "A penny saved is a penny earned.",
            "All things come to those who wait." };
               
        System.out.println("Pick number from 1-4.");
        input = in.nextLine();
        System.out.println(apho[Integer.parseInt(input)-1]);              
    }
    // "Uusittu" koodinpätkä 17.11. Jari H.
}

