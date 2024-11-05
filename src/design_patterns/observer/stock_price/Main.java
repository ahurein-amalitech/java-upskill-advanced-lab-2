package design_patterns.observer.stock_price;

class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockPriceDisplay display1 = new StockPriceDisplay("Display1");
        StockPriceDisplay display2 = new StockPriceDisplay("Display2");

        stockMarket.registerObserver("AAPL", display1);
        stockMarket.registerObserver("GOOGL", display2);
        stockMarket.registerObserver("AAPL", display2);

        stockMarket.setStockPrice("AAPL", 150.0f);
        stockMarket.setStockPrice("GOOGL", 2800.0f);
    }
}