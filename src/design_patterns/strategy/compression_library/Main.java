package design_patterns.strategy.compression_library;

class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor();

        compressor.setCompressionStrategy(new ZipCompression());
        compressor.compressFile("example.txt");

        compressor.setCompressionStrategy(new GzipCompression());
        compressor.compressFile("example.txt");
    }
}