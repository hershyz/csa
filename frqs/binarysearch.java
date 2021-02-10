import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Some code to get user input:
        Scanner scn = new Scanner(System.in);
        System.out.print("enter array separated by commas and spaces (a, b, c, d): ");
        String raw = scn.nextLine();
        String[] rawArr = raw.split(", ");
        int[] arr = new int[rawArr.length];
        for (int i = 0; i < rawArr.length; i++) {
            arr[i] = Integer.valueOf(rawArr[i]);
        }
        System.out.print("enter target value: ");
        int target = scn.nextInt();

        binarySearch(arr, target);
    }

    public static void binarySearch(int[] arr, int target) {

        // Bubble sorts the array in ascending order:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("sorted array: " + Arrays.toString(arr));

        // Step 1, sets max and min int values:
        int max = arr.length - 1;
        int min = 0;

        while (true) {

            // Step 2, target is not present if max < min:
            if (max < min) {
                System.out.println("target not found");
                break;
            }

            // Step 3, computes guess as an average of max and min:
            int guess = (max + min) / 2;

            // Step 4, returns the guess index if arr[guess] equals the target:
            if (arr[guess] == target) {
                System.out.println("target found at index: " + guess);
                break;
            }

            // Step 5, if the guess was too low, min is set to guess + 1:
            if (arr[guess] < target) {
                min = guess + 1;
            }

            // Step 6, if the guess was too high, max is set to guess - 1:
            if (arr[guess] > target) {
                max = guess - 1;
            }
        }
    }
}