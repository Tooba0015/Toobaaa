import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        
        String[] names = new String[6];
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase("Ali")) {
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("The name \"Ali\" is present.");
        }
            else {
            System.out.println("The name \"Ali\" is not present.");
        }

        scanner.close();
    }
}
