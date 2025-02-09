public class Excercise3 {

  public static void main(String[] args) {
        int[][] matrix = {
            {12, 13, 15, 16},
            {11, 110, 121, 17},
            {17, 18, 100, 21}
        };

    int sum = 0;
    System.out.println("Odd numbers in the matrix:");
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] % 2 == 0) {
             matrix[i][j] /= 2; 
             sum += matrix[i][j]; 
          } 
              else {
                    System.out.print(matrix[i][j] + " "); 

                }
            }
        }

        System.out.println("\nSum of updated even numbers: " + sum);

    }
}


