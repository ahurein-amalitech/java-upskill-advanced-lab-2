package design_patterns.strategy.compression_library;

class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using ZIP compression.");
    }
}

class GzipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using GZIP compression.");
    }
}