package design_patterns.observer.stock_price;

interface StockSubject {
    void registerObserver(String stockSymbol, StockObserver observer);
    void removeObserver(String stockSymbol, StockObserver observer);
    void notifyObservers(String stockSymbol);
}