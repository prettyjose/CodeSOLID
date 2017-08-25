import java.util.HashMap;
import java.util.Map;

public
class Broadcaster {

    Map<String, Notifier> notifiers;

    public
    Broadcaster(){
        notifiers = new HashMap<>();
        notifiers.put("email", new EmailNotifier());
        notifiers.put("sms", new SMSNotifier());
    }
    public void broadcast(WeatherTracker tracker){
        for(Notifier each: notifiers.values()) {
            each.broadcastWeather(tracker);
        }
    }
}
