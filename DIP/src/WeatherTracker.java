/**
 * Created by rajashrk on 8/24/17.
 */
public class WeatherTracker {

    String weatherCondition;
    EmailNotifier emailNotifier;
    SMSNotifier smsNotifier;

    public WeatherTracker() {
        emailNotifier = new EmailNotifier();
        smsNotifier = new SMSNotifier();
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void broadcastWeather() {
        emailNotifier.broadcastWeather(this);
        smsNotifier.broadcastWeather(this);
    }
}
