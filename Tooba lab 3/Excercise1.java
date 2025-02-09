import java.util.Scanner;

public class Excercise1 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int start = input.nextInt ();
System.out.print("Enter starting range");
int end = input.nextInt ();
System.out.print("Enter ending range");
for(int num=start;num<=end; num++) {
boolean isPrime = true;
for (int i=2; i<num; i++) {
if(num%i==0) {
isPrime = false;
break;
}
}
if(isPrime) {
System.out.println(num);
}
}
}
}