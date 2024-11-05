package design_patterns.strategy.sorting;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};

        Sorter sorter = new Sorter();

        sorter.setSortStrategy(new BubbleSort());
        sorter.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        sorter.setSortStrategy(new SelectionSort());
        array = new int[]{5, 3, 8, 6, 2};
        sorter.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
