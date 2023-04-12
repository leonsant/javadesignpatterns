package pt.leo.proxy.virtual;

public class Main {
    public static void main(String[] args) {
        ImageLoaderProxy imageLoaderProxy = new ImageLoaderProxy();
        imageLoaderProxy.load("myImage.jpg");
        imageLoaderProxy.load("myImage.jpg");
        imageLoaderProxy.load("myImage2.jpg");
        imageLoaderProxy.load("myImage.jpg");
    }
}
