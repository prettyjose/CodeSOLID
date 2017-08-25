import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rajashrk on 8/24/17.
 */
public class WeatherTracker {

    //Todo: Move all weather related logic(like weather condition) to Weather class
    String weatherCondition;
    Broadcaster broadcaster;

    public WeatherTracker() {
        broadcaster = new Broadcaster();
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void broadcastWeather() {

        broadcaster.broadcast(this);
    }
}
