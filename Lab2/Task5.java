public class Task5 {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1}
        };
        
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        if (containsN(matrix)) {
            System.out.println("The matrix contains the letter 'N'.");
        } else {
            System.out.println("The matrix does not contain the letter 'N'.");
        }
    }

    
    public static boolean containsN(int[][] matrix) {
        

        return matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][4] == 1 &&
               matrix[1][0] == 1 && matrix[1][2] == 1 && matrix[1][4] == 1 &&
               matrix[2][0] == 1 && matrix[2][3] == 1 && matrix[2][4] == 1 &&
               matrix[3][0] == 1 && matrix[3][4] == 1;
    }
}
