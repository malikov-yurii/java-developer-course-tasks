package module2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Module2Class1 {
    public static void main(String[] args) throws Throwable {
        System.out.println("Please enter type of array you would like to create (int/double). Or type exit to stop application.");
        String typeName;
        while (true) {
            typeName = new BufferedReader(new InputStreamReader(System.in)).readLine();

            if ("double".equals(typeName)) {
                double[] doubleArray = {1, 2, 234, 234, 3452, 4, 456, 4356, 3456, 4};
                System.out.println("Now we'll test methods with double[]");
                System.out.println("Summary of double array items = " + getSum(doubleArray));
                System.out.println("Minimum item of double array = " + getMin(doubleArray));
                System.out.println("Maximum item of double array items = " + getMax(doubleArray));
                System.out.println("Maximum positive item of double array items = " + getMaxPositive(doubleArray));
                System.out.println("Multiplication of double array items = " + getMultiplication(doubleArray));
                System.out.println("Modulus of first and last element of double array = " + getModulsOfFirstAndLastElements(doubleArray));
                System.out.println("\nPlease enter type of array you would like to create (int/double). Or type exit to stop application.");
            } else if ("int".equals(typeName)) {
                int[] doubleArray = {1, 2, 234, 234, 3452, 4, 456, 4356, 3456, 4};
                System.out.println("Now we'll test methods with int[]");
                System.out.println("Summary of int array items = " + getSum(doubleArray));
                System.out.println("Minimum item of int array = " + getMin(doubleArray));
                System.out.println("Maximum item of int array items = " + getMax(doubleArray));
                System.out.println("Maximum positive item of int array items = " + getMaxPositive(doubleArray));
                System.out.println("Multiplication of int array items = " + getMultiplication(doubleArray));
                System.out.println("Modulus of first and last element of int array = " + getModulsOfFirstAndLastElements(doubleArray));
                System.out.println("\nPlease enter type of array you would like to create (int/double). Or type exit to stop application.");
            } else if (("exit".equals(typeName))) {
                System.out.println("Goodbye!");
                break;
            } else
                System.out.println("Invalid input. Please enter type array type you would like to create (int/double). Or type exit to stop application.");
        }
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int x : numbers)
            sum += x;
        return sum;
    }

    public static int getSum(double[] numbers) {
        int sum = 0;
        for (double x : numbers)
            sum += (int) x;
        return sum;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        return min;
    }

    public static int getMin(double[] numbers) {
        int min = (int) numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if ((int) numbers[i] < min)
                min = (int) numbers[i];
        return min;
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        return max;
    }

    public static int getMax(double[] numbers) {
        int max = (int) numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if ((int) numbers[i] > max)
                max = (int) numbers[i];
        return max;
    }

    // according to task of homework we deal only with natural nambers [1, 2, 3, ..., ∞)
    // so getMax() and getMaxPositive have same logic
    public static int getMaxPositive(int[] numbers) {
        return getMax(numbers);
    }

    // according to task of homework we deal only with natural nambers [1, 2, 3, ..., ∞)
    // so getMax() and getMaxPositive have same logic
    public static int getMaxPositive(double[] numbers) {
        return getMax(numbers);
    }

    public static long getMultiplication(int[] numbers) {
        long multiplication = 1;
        for (int x : numbers)
            multiplication *= x;
        return multiplication;
    }

    public static long getMultiplication(double[] numbers) {
        long multiplication = 1;
        for (double x : numbers)
            multiplication *= (int) x;
        return multiplication;
    }

    public static int getModulsOfFirstAndLastElements(int[] numbers) {
        return numbers[0] % numbers[numbers.length - 1];
    }

    public static int getModulsOfFirstAndLastElements(double[] numbers) {
        return (int) numbers[0] % (int) numbers[numbers.length - 1];
    }


}
