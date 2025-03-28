package weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WeatherApp {
    public static void main(String[] args) throws Exception {
        String city = "Istanbul";
        URL url = new URL("https://wttr.in/" + city + "?format=3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String weather = reader.readLine();
        System.out.println("🌤️ Hava durumu: " + weather);
    }
}
