public class Excercise4 {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        int i = 0;

     do {
      arr[i] = (i + 1) * (i + 1); 
      i++;
      } while (i < 10);

        
     int sum = 0;
     int j = 0;
        while (j < arr.length) {
            if (arr[j] == 81) { 
            break;
            }

      if (arr[j] % 2 != 0) { 
      sum += arr[j];
   }
      j++;
     }

        
        System.out.println("Sum of odd numbers: " + sum);
    }
}





 
