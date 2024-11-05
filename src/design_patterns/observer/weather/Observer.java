package design_patterns.observer.weather;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}
