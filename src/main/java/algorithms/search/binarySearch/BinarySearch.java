package algorithms.search.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        final Integer[] integers = {1, -4, 10, 14, 3, 2, -5, 0, -4, 10};
        final Integer[] sortedIntegers = Arrays.stream(integers).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(sortedIntegers));

        final int position = binarySearch(sortedIntegers, 10);
        System.out.println(position);
    }

    static int binarySearch(final Integer[] input, final int searchValue) {
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            final int avg = (left + right) / 2;
            if (input[avg] < searchValue) {
                left = avg + 1;
            } else if (input[avg] > searchValue) {
                right = avg - 1;
            } else {
                return avg;
            }
        }
        return -1;
    }
}
