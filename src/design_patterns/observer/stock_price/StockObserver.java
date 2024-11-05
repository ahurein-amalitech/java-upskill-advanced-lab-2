package design_patterns.observer.stock_price;

public interface StockObserver {
    void update(String stockSymbol, float price);
}
