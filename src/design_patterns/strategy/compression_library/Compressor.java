package design_patterns.strategy.compression_library;

class Compressor {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFile(String fileName) {
        if (compressionStrategy != null) {
            compressionStrategy.compress(fileName);
        } else {
            System.out.println("No compression strategy set.");
        }
    }
}
