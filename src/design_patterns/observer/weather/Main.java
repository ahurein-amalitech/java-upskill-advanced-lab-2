package design_patterns.observer.weather;

class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display1 = new WeatherDisplay("display one");
        Logger logger = new Logger();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(logger);

        weatherStation.setWeatherData(25.5f, 65.0f, 1013.0f);
        weatherStation.setWeatherData(27.0f, 70.0f, 1010.5f);
    }
}
