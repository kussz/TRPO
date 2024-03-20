import java.util.*;
import java.lang.*;
public class RadiusSort {

    public static void sort(int[] numbers) {
        int maximumNumber = findMaximumNumberIn(numbers);
        int numberOfDigits = calculateNumberOfDigitsIn(maximumNumber);
        int placeValue = 1;

        while (numberOfDigits-- > 0) {
            applyCountingSortOn(numbers, placeValue);
            placeValue *= 10;
        }
    }

    private static int findMaximumNumberIn(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    private static int calculateNumberOfDigitsIn(int number) {
        return (int) Math.log10(number) + 1;
    }

    private static void applyCountingSortOn(int[] numbers, int placeValue) {
        int range = 10;
        int length = numbers.length;
        int[] output = new int[length];
        int[] count = new int[range];

        for (int number : numbers) {
            int digit = (number / placeValue) % range;
            count[digit]++;

        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = length - 1; i >= 0; i--) {
            int digit = (numbers[i] / placeValue) % range;
            output[count[digit] - 1] = numbers[i];
            count[digit]--;
        }

        System.arraycopy((Object)output, 0, (Object)numbers, 0, length);
    }

}
