/**
 * Created by rajashrk on 8/24/17.
 */
public class SMSNotifier implements Notifier{

    public void broadcastWeather(WeatherTracker weatherTracker) {
        System.out.println("Sending SMS weather condition....." + weatherTracker.getWeatherCondition());
    }
}
