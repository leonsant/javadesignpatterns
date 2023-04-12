package pt.leo.proxy.remote;

public class Main {
    public static void main(String[] args) {
        WeatherDataFetcherProxy weatherDataFetcherProxy = new WeatherDataFetcherProxy();
        String lisbonTime = weatherDataFetcherProxy.fetch();
        System.out.println("Lisbon time data: " + lisbonTime);
    }
}
