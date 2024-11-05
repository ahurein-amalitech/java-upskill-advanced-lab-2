package design_patterns.observer.weather;

class Logger implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Logging data: Temperature = " + temperature + ", Humidity = " + humidity +
                ", Pressure = " + pressure);
    }
}