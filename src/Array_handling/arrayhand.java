package Array_handling;

import java.util.Random;
import java.util.Scanner;

public class arrayhand {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Part 2.1 & 2.4: User Input Array and Sum calculation
        System.out.print("Enter length for user array: ");
        int userLen = scanner.nextInt();
        int[] userArr = inputArray(userLen);
        printArray(userArr);

        int sum = 0;
        for (int num : userArr) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Part 2.2 & 2.5: Random Array and Max Search
        System.out.print("Enter length for random array: ");
        int randLen = scanner.nextInt();
        int[] randArr = createRandomArray(randLen);
        printArray(randArr);

        if (randArr.length > 0) {
            int maxVal = randArr[0];
            for (int val : randArr) {
                if (val > maxVal) {
                    maxVal = val;
                }
            }
            System.out.println("Largest value in random array: " + maxVal);
        }

        // Part 2.6: Search Value in Array
        System.out.print("\nEnter value to search in random array: ");
        int searchValue = scanner.nextInt();
        int foundIndex = searchArray(randArr, searchValue);
        if (foundIndex != -1) {
            System.out.println("Value " + searchValue + " found at index: " + foundIndex);
        } else {
            System.out.println("Value " + searchValue + " was not found in the array (-1).");
        }
    }

    // Part 2.1: Input Array Method
    public static int[] inputArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Part 2.2: Create an array with random values method
    public static int[] createRandomArray(int length) {
        int[] arr = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    // Part 2.3: Print Array Method
    public static void printArray(int[] array) {
        System.out.print("Array contents: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }

    // Part 2.6: Search value in array method
    public static int searchArray(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
