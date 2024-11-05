package design_patterns.observer.weather;

class WeatherDisplay implements Observer {
    private String displayId;

    public WeatherDisplay(String displayId) {
        this.displayId = displayId;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Display " + displayId + " - Temperature: " + temperature +
                "°C, Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}
