package algorithms.search.sequentialSearch;

public class SequentialSearch {
    public static void main(String[] args) {
        final Integer[] integers = {1, -4, 10, 14, 3, 2, -5, 0, -4, 10};
        final int position = sequentialSearch(integers, 10);
        System.out.println(position);
    }

    static int sequentialSearch(final Integer[] input, final int searchValue) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
