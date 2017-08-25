/**
 * Created by rajashrk on 8/24/17.
 */
public class EmailNotifier implements Notifier {

    public void broadcastWeather(WeatherTracker weatherTracker) {
        System.out.println("Emailing weather condition........." + weatherTracker.getWeatherCondition());
    }
}
