package module06;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysUtils {

    public static final int[] reverse(int[] array) {
        // arrayCopy is created in order to not to change original array
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < (array.length / 2); i++) {
            newArray[i] = array[array.length - i - 1];
            newArray[array.length - i - 1] = array[i];
        }
        return newArray;
    }

    public final static int[] findEvenElements(int[] array) {
        return IntStream.of(array).filter(i -> i % 2 == 0).toArray();
    }

    public static final int sum(int array[]) {
        return IntStream.of(array).sum();
    }

    public static final int min(int array[]) {
        return IntStream.of(array).min().getAsInt();
    }

    public static final int max(int array[]) {
        return IntStream.of(array).max().getAsInt();
    }

    // if there is no positive item then method returns -1
    public static final int maxPositive(int array[]) {
        int max = ArraysUtils.max(array);
        return max >= 0 ? max : -1;
    }

    public static final long multiplication(int array[]) {
        long result = 1;
        for (int x : array)
            result *= x;
        return result;
    }

    // it is the only solution I came up with (about zero)
    public static final int modulus(int array[]) throws ArithmeticException {
        if (array[array.length - 1] != 0)
            return array[0] % array[array.length - 1];
        else
            throw new ArithmeticException();
    }

    // if return MIN_VALUE than all items in array are equal
    public static int secondLargest(int array[]) {
        // arrayCopy is created in order to not to change original external array
        int[] arrayCopy = Arrays.copyOf(array, array.length);
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
}
