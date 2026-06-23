public class TwoSumBruteForce 
{

    public static void main(String[] args) 
	{

        // Array
        int[] arr = {2, 7, 11, 15};

        // Target value
        int target = 9;

        // First loop
        for (int i = 0; i < arr.length; i++) {

            // Second loop
            for (int j = i + 1; j < arr.length; j++) {

                // Check sum of two elements
                if (arr[i] + arr[j] == target) {

                    // Print indexes
                    System.out.println("Indexes: " + i + " , " + j);

                    // Print values
                    System.out.println("Values: " + arr[i] + " + " + arr[j]);

                }
            }
        }
    }
}