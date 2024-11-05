package design_patterns.adapter.data_source_adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
            CSVFile csvFile = new CSVFile("data.csv");
            DataSource dataSource = new CSVFileAdapter(csvFile);

            List<String> data = dataSource.getData();
            data.forEach(System.out::println);
    }
}
