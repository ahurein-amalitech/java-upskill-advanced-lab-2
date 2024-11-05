package design_patterns.builder.search_query;

public class Main {
    public static void main(String[] args) {
        SearchQuery query = new SearchQuery.SearchQueryBuilder().minPrice(1).maxPrice(12).build();
        System.out.println(query);
    }
}
