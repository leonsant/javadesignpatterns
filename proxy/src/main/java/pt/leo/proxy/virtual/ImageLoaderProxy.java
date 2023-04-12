package pt.leo.proxy.virtual;

import java.util.HashMap;
import java.util.Map;

public class ImageLoaderProxy implements Loader {
    Map<String, Image> imageCache = new HashMap<>();

    @Override
    public Image load(String filename) {
        Image image = imageCache.computeIfAbsent(filename, key -> {
            ImageLoader imageLoader = new ImageLoader();
            return imageLoader.load(key);
        });

        return image;
    }
}
