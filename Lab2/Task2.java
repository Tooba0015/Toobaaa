import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        
        int sum = 0;
        System.out.println("Multiples of 4 from the entered array:");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 4 == 0) {
                System.out.print(numbers[i] + " ");
                sum += numbers[i];
            }
        }
        
        
        System.out.println("Total sum of multiples of 4: " + sum);
        
        
        scanner.close();
    }
}
