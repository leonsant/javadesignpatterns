package pt.leo.proxy.remote;

// I guess here we could implement some request limiting mechanism by, for instance,
// skipping the API call if the last weather data we've fetched is not older than n-hours.
public class WeatherDataFetcher implements DataFetcher {
    private final String url;

    public WeatherDataFetcher(String url) {
        this.url = url;
    }

    @Override
    public String fetch() {
        System.out.println("Accessing remote resource at " + url + " ...");
        return "Lisbon, 13ºC, Partly cloudy";
    }
}
