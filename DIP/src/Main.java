/**
 * Created by rajashrk on 8/24/17.
 */
public class Main {

    public static void main(String[] args) {
        WeatherTracker tracker = new WeatherTracker();
        tracker.setWeatherCondition(" its heavily raining");
        tracker.broadcastWeather();
    }
}
