package pt.leo.proxy.protection;

public class Main {
    public static void main(String[] args) {
        // Viewer 1
        int viewerAge = 18;
        MovieProxy theBatmanMovie = new MovieProxy("The Batman", 2022, 14, viewerAge);
        theBatmanMovie.watch();

        viewerAge = 12;
        theBatmanMovie = new MovieProxy("The Batman", 2022, 14, viewerAge);
        theBatmanMovie.watch();

        MovieProxy legoBatmanTheMovie = new MovieProxy("Lego Batman: The Movie", 2017, 12, viewerAge);
        legoBatmanTheMovie.watch();
    }
}
