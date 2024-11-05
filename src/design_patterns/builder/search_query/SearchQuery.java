package design_patterns.builder.search_query;

public class SearchQuery {
    private final Integer minPrice;
    private final Integer maxPrice;

    public SearchQuery(int minPrice, int maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public String toString() {
        return "SearchQuery{" +
                "minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }

    public static class SearchQueryBuilder {
        private Integer minPrice;
        private Integer maxPrice;

        public SearchQueryBuilder maxPrice(int maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public SearchQueryBuilder minPrice(int minPrice) {
            this.minPrice = minPrice;
            return this;
        }

        public SearchQuery build() {
            return new SearchQuery(minPrice, maxPrice);
        }
    }

}
