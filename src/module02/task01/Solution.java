package module02.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static int sum(int numbers[]) {
        int sum = 0;
        for (int x : numbers)
            sum += x;
        return sum;
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (double x : numbers)
            sum += x;
        return sum;
    }

    public static int min(int numbers[]) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        return min;
    }

    public static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        return min;
    }

    public static int max(int numbers[]) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        return max;
    }

    public static double max(double[] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        return max;
    }

    // if there is no positive item then method returns -1
    public static int maxPositive(int numbers[]) {
        int max = numbers[1];
        for (int i = 1; i < numbers.length; i++)
            if ((numbers[i] > max) && (numbers[i] >= 0))
                max = numbers[i];
        return max >= 0 ? max : -1;
    }

    // if there is no positive item then method returns -1
    public static double maxPositive(double[] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if ((numbers[i] > max) && (numbers[i] >= 0))
                max = numbers[i];
        return max >= 0 ? max : -1;

    }

    public static long multiplication(int numbers[]) {
        long multiplication = 1;
        for (int x : numbers)
            multiplication *= x;
        return multiplication;
    }

    public static double multiplication(double[] numbers) {
        double multiplication = 1d;
        for (double x : numbers)
            multiplication *= x;
        return multiplication;
    }

    // it is the only solution I came up with (about zero)
    public static int modulus(int numbers[]) throws ArithmeticException {
        if (numbers[numbers.length - 1] != 0)
            return numbers[0] % numbers[numbers.length - 1];
        else
            throw new ArithmeticException();
    }

    // it is the only solution I came up with (about zero)
    public static double modulus(double[] numbers) throws ArithmeticException {
        if (numbers[numbers.length - 1] != 0)
            return numbers[0] % numbers[numbers.length - 1];
        else
            throw new ArithmeticException();
    }

    // if return MIN_VALUE than all items in array are equal
    public static int secondLargest(int numbers[]) {
        // arrayCopy is created in order to not to change original external array
        int[] arrayCopy = Arrays.copyOf(numbers, numbers.length);
        int bufferVariable;

        for (int k = arrayCopy.length - 1; k >= 0; k--) {
            for (int i = 0; i < k; i++)
                if (arrayCopy[i] > arrayCopy[i + 1]) {
                    bufferVariable = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[i + 1];
                    arrayCopy[i + 1] = bufferVariable;
                }
            if (k < arrayCopy.length - 1)
                if (arrayCopy[k] != arrayCopy[k + 1])
                    return arrayCopy[k];
        }

        return Integer.MIN_VALUE;
    }

    // if return MIN_VALUE than all items in array are equal
    public static double secondLargest(double[] numbers) {
        // arrayCopy is created in order to not to change original external array
        double[] arrayCopy = Arrays.copyOf(numbers, numbers.length);
        double bufferVariable;

        for (int k = arrayCopy.length - 1; k >= 0; k--) {
            for (int i = 0; i < k; i++)
                if (arrayCopy[i] > arrayCopy[i + 1]) {
                    bufferVariable = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[i + 1];
                    arrayCopy[i + 1] = bufferVariable;
                }
            if (k < arrayCopy.length - 1)
                if (arrayCopy[k] != arrayCopy[k + 1])
                    return arrayCopy[k];
        }

        return Double.MIN_VALUE;
    }


    public static void main(String[] args) throws Throwable {
        System.out.println("Please enter type of array you would like to create (int/double). Or type exit to stop application.");
        String typeName;
        while (true) {
            typeName = new BufferedReader(new InputStreamReader(System.in)).readLine();

            if ("double".equals(typeName)) {
                double[] doubleArray = {-3.3333, 2.3, 234.65, 356.789, -32.12, 4.45, 356.789, 356.789, 56.48, 1.08};
                System.out.println("Now we'll test methods with double[]");
                System.out.println("Summary of double array items = " + sum(doubleArray));
                System.out.println("Minimum item of double array = " + min(doubleArray));
                System.out.println("Maximum item of double array items = " + max(doubleArray));
                System.out.println("Maximum positive item of double array items = " + maxPositive(doubleArray));
                System.out.println("Multiplication of double array items = " + multiplication(doubleArray));
                try {
                    System.out.println("Modulus of first and last element of double array = " + modulus(doubleArray));
                } catch (ArithmeticException e) {
                    System.out.println("Can not execute modulus. Error: division by zero.");
                }
                System.out.println("Second largest element of double array = " + secondLargest(doubleArray));
                System.out.println("\nPlease enter type of array you would like to create (int/double). Or type exit to stop application.");
            } else if ("int".equals(typeName)) {
                int[] intArray = {745, 2, 745, 234, -3452, 4, 456, 745, 357, 0};
                System.out.println("Now we'll test methods with int[]");
                System.out.println("Summary of int array items = " + sum(intArray));
                System.out.println("Minimum item of int array = " + min(intArray));
                System.out.println("Maximum item of int array items = " + max(intArray));
                System.out.println("Maximum positive item of int array items = " + maxPositive(intArray));
                System.out.println("Multiplication of int array items = " + multiplication(intArray));
                try {
                    System.out.println("Modulus of first and last element of int array = " + modulus(intArray));
                } catch (ArithmeticException e) {
                    System.out.println("Can not execute modulus. Error: division by zero.");
                }
                System.out.println("Second largest element of int array = " + secondLargest(intArray));
                System.out.println("\nPlease enter type of array you would like to create (int/double). Or type exit to stop application.");
            } else if (("exit".equals(typeName))) {
                System.out.println("Goodbye!");
                break;
            } else
                System.out.println("Invalid input. Please enter type array type you would like to create (int/double). Or type exit to stop application.");
        }
    }
}
