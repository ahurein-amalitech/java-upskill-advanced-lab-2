package design_patterns.strategy.sorting;

class Sorter {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[] array) {
        if (sortStrategy != null) {
            sortStrategy.sort(array);
        } else {
            System.out.println("No sorting strategy set.");
        }
    }
}
