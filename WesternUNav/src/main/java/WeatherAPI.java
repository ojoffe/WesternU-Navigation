/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aaron
 */
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherAPI {
    private static final String ENDPOINT = "https://weatherapi-com.p.rapidapi.com/current.json";
    private static final String API_KEY = "601c08e0e0msh1dc185f80ea6d59p13e2eajsnbc5f2f1e5341";
    
    public static String getWeatherData(String city) throws IOException, InterruptedException {
        String url = String.format("%s?q=%s", ENDPOINT, URLEncoder.encode(city, "UTF-8"));
        
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("X-RapidAPI-Key", API_KEY)
            .header("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static void main(String[] args) {
        try {
            String weatherData = WeatherAPI.getWeatherData("London, Ontario");
            System.out.println(weatherData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


    


