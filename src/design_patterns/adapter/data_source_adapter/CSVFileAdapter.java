package design_patterns.adapter.data_source_adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVFileAdapter implements DataSource {
    private final CSVFile csvFile;

    public CSVFileAdapter(CSVFile csvFile) {
        this.csvFile = csvFile;
    }

    @Override
    public List<String> getData() {
        String csvData = csvFile.readCSV();
        String[] dataArray = csvData.split(",");
        List<String> dataList = new ArrayList<>();
        Collections.addAll(dataList, dataArray);
        return dataList;
    }
}
