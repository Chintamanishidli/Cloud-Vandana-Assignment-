package assignment;

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Create a Random object for generating random indices
        Random rand = new Random();

        // Shuffle the array
        for (int i = originalArray.length - 1; i > 0; i--) {
            int randomIndex = rand.nextInt(i + 1);

            // Swap the elements at i and randomIndex
            int temp = originalArray[i];
            originalArray[i] = originalArray[randomIndex];
            originalArray[randomIndex] = temp;
        }

        // Print the shuffled array
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
    }
}