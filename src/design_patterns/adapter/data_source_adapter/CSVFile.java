package design_patterns.adapter.data_source_adapter;

public class CSVFile {
    private final String filePath;

    public CSVFile(String filePath) {
        this.filePath = filePath;
    }

    public String readCSV(){
        return "name,age,ahurein,12";
    }
}
