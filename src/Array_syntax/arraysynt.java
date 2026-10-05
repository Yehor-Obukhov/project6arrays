package Array_syntax;

public class arraysynt   {

    public static void main(String[] args) {

        // Part 1 Demonstration of array creation
        int[] fixedArray = new int[10];

        int dynamicSize = 5;
        double[] doubleArray = new double[dynamicSize];

        int[] literalArray = {1, 4, 2, 8, 5, 7};
        String[] stringArray = {"Java", "Code", "Array"};
        char[] charArray = {'a', 'b', 'c'};
        boolean[] boolArray = {true, false, true};

        // Show use of array.length
        System.out.println("Literal array length: " + literalArray.length);
        System.out.println("String array length: " + stringArray.length);

        // Set and access array elements by index
        fixedArray[4] = 45;
        System.out.println("5th element value: " + fixedArray[4]);

        // Iterate over array (array traversal)
        System.out.println("\n--- Traversing literalArray with for loop ---");
        for (int i = 0; i < literalArray.length; i++) {
            System.out.println("Element at index " + i + ": " + literalArray[i]);
        }

        System.out.println("\n--- Traversing stringArray with enhanced for loop ---");
        for (String str : stringArray) {
            System.out.println("Language/Word: " + str);
        }

        System.out.println("\n--- Traversing boolArray with while loop ---");
        int index = 0;
        while (index < boolArray.length) {
            System.out.println("Bool element [" + index + "]: " + boolArray[index]);
            index++;
        }
        // Demonstrate error of accessing array element by non-existing index
        System.out.println("\n--- Demonstrating ArrayIndexOutOfBoundsException ---");
        System.out.println("Trying to access index 1000...");
        int errorTrigger = fixedArray[1000]; // This line throws ArrayIndexOutOfBoundsException
    }
}