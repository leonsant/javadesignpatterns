package pt.leo.proxy.virtual;

public class ImageLoader implements Loader {
    @Override
    public Image load(String filename) {
        System.out.printf("Running expensive image loading for %s ...%n", filename);
        return new Image(filename);
    }
}
