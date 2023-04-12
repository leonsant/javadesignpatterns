package pt.leo.proxy.protection;

public class MovieProxy implements Watchable {

    private final String name;
    private final int yearOfRelease;
    private final int minimumAge;
    private final int viewerAge;

    public MovieProxy(String name, int yearOfRelease, int minimumAge, int viewerAge) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.minimumAge = minimumAge;
        this.viewerAge = viewerAge;
    }

    public void watch() {
        if (viewerAge >= minimumAge) {
            Movie movie = new Movie(name, yearOfRelease, minimumAge);
            movie.watch();
        } else {
            System.out.println("You are " + viewerAge + " years old. Please wait until you reach " + minimumAge + " to see '" + name + " (" + yearOfRelease + ")'");
        }
    }
}
