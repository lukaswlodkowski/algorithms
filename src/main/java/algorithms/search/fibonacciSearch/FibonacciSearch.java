package algorithms.search.fibonacciSearch;

import java.util.Arrays;

public class FibonacciSearch {
    public static void main(String[] args) {
        final Integer[] integers = {1, -4, 10, 14, 3, 2, -5, 0, -4, 10};
        final Integer[] sorted = Arrays.stream(integers).sorted().toArray(Integer[]::new);
        final int position = fibonacciSearch(sorted, 10);
        System.out.println(position);
    }

    static int fibonacciSearch(final Integer[] input, final int searchValue) {
        int fib1 = 0;
        int fib2 = 1;
        int fibN = fib2 + fib1;

        while (fibN <= searchValue){
            fib2 = fib1;
            fib1 = fibN;
            fibN = fib2 + fib1;
        }

        int offset = -1;

        while (fibN > 1){
            int i = Math.min(offset + fib2, input.length -1);

            if (input[i]< searchValue){
                fibN = fib1;
                fib1 = fib2;
                fib2 = fibN - fib2;
                offset = i;
            } else if (input[i] > searchValue){
                fibN = fib2;
                fib2 = fib1 - fib2;
                fib1 = fibN - fib1;
            } else {
                return i;
            }
        }

        if (fib1 == searchValue && input[offset + 1] == searchValue){
            return searchValue;
        }

        return -1;
    }

}
