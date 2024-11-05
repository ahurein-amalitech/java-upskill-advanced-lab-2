package design_patterns.observer.stock_price;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StockMarket implements StockSubject {
    private Map<String, List<StockObserver>> observersMap;
    private Map<String, Float> stockPrices;

    public StockMarket() {
        observersMap = new HashMap<>();
        stockPrices = new HashMap<>();
    }

    public void setStockPrice(String stockSymbol, float price) {
        stockPrices.put(stockSymbol, price);
        notifyObservers(stockSymbol);
    }

    @Override
    public void registerObserver(String stockSymbol, StockObserver observer) {
        observersMap.computeIfAbsent(stockSymbol, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void removeObserver(String stockSymbol, StockObserver observer) {
        List<StockObserver> observers = observersMap.get(stockSymbol);
        if (observers != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(String stockSymbol) {
        List<StockObserver> observers = observersMap.get(stockSymbol);
        if (observers != null) {
            for (StockObserver observer : observers) {
                observer.update(stockSymbol, stockPrices.get(stockSymbol));
            }
        }
    }
}