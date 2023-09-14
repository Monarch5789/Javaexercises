public class ArrayUtil_Test {
    public static void main(String[] args) {

        // statements for output formatting
        System.out.println("*******************************");
        System.out.println("     Array Utility Project     ");
        System.out.println("*******************************");

        ArrayUtil arrayUtility = new ArrayUtil();

        int[] arr0 = {};
        arrayUtility.setIntArray(arr0);
        System.out.println("Test 0 - min value: " + validate(0, arrayUtility.minValue()));
        System.out.println("Test 0 - max value: " + validate(0, arrayUtility.maxValue()));
        System.out.println("Test 0 - count unique: " + validate(0, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr1 = { 3, -3, -1, 0, -1, 4, 0, 3, 4, 0 };
        arrayUtility.setIntArray(arr1);
        System.out.println("Test 1 - min value: " + validate(-3, arrayUtility.minValue()));
        System.out.println("Test 1 - max value: " + validate(4, arrayUtility.maxValue()));
        System.out.println("Test 1 - count unique: " + validate(5, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr2 = { 4, 3, -1, 1, -3, -1, 1, -5, -3, -4 };
        arrayUtility.setIntArray(arr2);
        System.out.println("Test 2 - min value: " + validate(-5, arrayUtility.minValue()));
        System.out.println("Test 2 - max value: " + validate(4, arrayUtility.maxValue()));
        System.out.println("Test 2 - count unique: " + validate(7, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr3 = { 0, 0, 0, -3, 0, -1, -3, 1, 1, 2 };
        arrayUtility.setIntArray(arr3);
        System.out.println("Test 3 - min value: " + validate(-3, arrayUtility.minValue()));
        System.out.println("Test 3 - max value: " + validate(2, arrayUtility.maxValue()));
        System.out.println("Test 3 - count unique: " + validate(5, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr4 = { 8, 7, -1, -2, 9, 0, 3, 2, -2, 3, -2, 9, 2, -3, 3 };
        arrayUtility.setIntArray(arr4);
        System.out.println("Test 4 - min value: " + validate(-3, arrayUtility.minValue()));
        System.out.println("Test 4 - max value: " + validate(9, arrayUtility.maxValue()));
        System.out.println("Test 4 - count unique: " + validate(9, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        arrayUtility.setIntArray(arr5);
        System.out.println("Test 5 - min value: " + validate(1, arrayUtility.minValue()));
        System.out.println("Test 5 - max value: " + validate(10, arrayUtility.maxValue()));
        System.out.println("Test 5 - count unique: " + validate(10, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr6 = { 2, -3, -1, 0, 1, -2 };
        arrayUtility.setIntArray(arr6);
        System.out.println("Test 6 - min value: " + validate(-3, arrayUtility.minValue()));
        System.out.println("Test 6 - max value: " + validate(2, arrayUtility.maxValue()));
        System.out.println("Test 6 - count unique: " + validate(6, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr7 = { -4, 3, 6, -2, -1, -4 };
        arrayUtility.setIntArray(arr7);
        System.out.println("Test 7 - min value: " + validate(-4, arrayUtility.minValue()));
        System.out.println("Test 7 - max value: " + validate(6, arrayUtility.maxValue()));
        System.out.println("Test 7 - count unique: " + validate(5, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr8 = { 0, -1, 0 };
        arrayUtility.setIntArray(arr8);
        System.out.println("Test 8 - min value: " + validate(-1, arrayUtility.minValue()));
        System.out.println("Test 8 - max value: " + validate(0, arrayUtility.maxValue()));
        System.out.println("Test 8 - count unique: " + validate(2, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr9 = { 1, 2, -1, 40, 1, 40, 0, 0, -3, 2, 2, -2, -5, 0, 1, -4, -5 };
        arrayUtility.setIntArray(arr9);
        System.out.println("Test 9 - min value: " + validate(-5, arrayUtility.minValue()));
        System.out.println("Test 9 - max value: " + validate(40, arrayUtility.maxValue()));
        System.out.println("Test 9 - count unique: " + validate(9, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");

        int[] arr10 = { 4, 5, 5, 4, 1, 5, -3, 4, -1, -2, -2, -2, -2, -2, -2, 1, 4, 5, -5 };
        arrayUtility.setIntArray(arr10);
        System.out.println("Test 10 - min value: " + validate(-5, arrayUtility.minValue()));
        System.out.println("Test 10 - max value: " + validate(5, arrayUtility.maxValue()));
        System.out.println("Test 10 - count unique: " + validate(7, arrayUtility.countUniqueIntegers()));
        System.out.println("-----------------------");
    }

    // DO NOT MODIFY validate METHOD
    private static String validate(int expected, int answer) {
        if (answer != expected) {
            return ("The result " + answer + " does not match expected: " + expected + " --->> Failed");
        } else {
            return ("The result " + answer + "  match expected: " + expected + " --->> OK");
        }
    }
}
