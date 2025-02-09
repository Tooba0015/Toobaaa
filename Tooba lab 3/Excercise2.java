import java.util.Scanner;

public class Excercise2{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a String: ");
String input = scanner.nextLine();

input = input.toLowerCase();

int start = 0;
int end = input.length() -1;

boolean isPalindrome = true;

while (start < end) {

if (input.charAt(start) != input.charAt(end)) {
isPalindrome = false;
break;

}

start++;
end--;

}

if(isPalindrome) {
System.out.println("String is Palindrome");
}
else{
System.out.println("String is not Palindrome");
}

scanner.close();

}

}