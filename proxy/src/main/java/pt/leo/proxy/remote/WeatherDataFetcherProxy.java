package pt.leo.proxy.remote;

public class WeatherDataFetcherProxy implements DataFetcher {
    @Override
    public String fetch() {
        String url = "http://time.com/api/v1/Lisbon/10042023";
        WeatherDataFetcher weatherDataFetcher = new WeatherDataFetcher(url);
        return weatherDataFetcher.fetch();
    }
}
