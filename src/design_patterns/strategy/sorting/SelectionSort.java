package design_patterns.strategy.sorting;

class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Using Selection Sort");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap array[minIdx] and array[i]
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}