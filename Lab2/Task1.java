import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
        char[] const__arr = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
       
        
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter a character: ");
        char user_inp = scanner.next().toLowerCase().charAt(0); 

        boolean isConsonant = false;
        for (char c : const__arr) {
            if (user_inp == c) {
                isConsonant = true;
                break;
            }
        }

        
        if (isConsonant) {
            System.out.println("The character '" + user_inp + "' is a consonant and is present in the array.");
        } else {
            System.out.println("The character '" + user_inp + "' is either a vowel or not present in the array.");
        }

        
        scanner.close();
    }
}
