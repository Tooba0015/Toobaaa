public class Task7 {

    public static void main(String[] args) {
        
        int[] array = {6, 5, 2, 20, 8};

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

       
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

       
        if (largest % 2 == 0) {
            System.out.println("The largest element is a multiple of 2.");
        } 
            else {
            System.out.println("The largest element is not a multiple of 2.");
        }
    }
}
