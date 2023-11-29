package algorithms.search.exponentialSearch;

import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        final Integer[] integers = {1, -4, 10, 14, 3, 2, -5, 0, -4, 10};
        Arrays.sort(integers);

        final int position = exponentialSearch(integers, 10);
        System.out.println(position);
    }

    static int exponentialSearch(Integer[] input, int searchValue) {
        if (input[0] == searchValue) {
            return 0;
        }

        int i = 1;
        while (i < input.length && input[i] <= searchValue) {
            i = i * 2;
        }

        return binarySearch(input, searchValue, i);
    }

    private static int binarySearch(Integer[] input, int searchValue, int length) {
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            final int avg = (l + r) / 2;
            if (input[avg] < searchValue) {
                l = avg + 1;
            } else if (input[avg] > searchValue) {
                r = avg - 1;
            } else {
                return avg;
            }
        }
        return -1;
    }
}
