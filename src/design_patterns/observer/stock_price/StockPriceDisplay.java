package design_patterns.observer.stock_price;

class StockPriceDisplay implements StockObserver {
    private String displayId;

    public StockPriceDisplay(String displayId) {
        this.displayId = displayId;
    }

    @Override
    public void update(String stockSymbol, float price) {
        System.out.println("Display " + displayId + " - Stock: " + stockSymbol + " Price: " + price);
    }
}