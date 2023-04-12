package pt.leo.proxy.protection;

public class Movie implements Watchable {
    private final String name;
    private final int yearOfRelease;
    private final int minimumAge;

    public Movie(String name, int yearOfRelease, int minimumAge) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.minimumAge = minimumAge;
    }

    public void watch() {
        System.out.println("Bring the popcorns ... '" + name + " (" + yearOfRelease + ")' is about to begin ...");
    }
}
