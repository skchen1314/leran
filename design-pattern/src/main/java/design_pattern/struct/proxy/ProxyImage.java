package design_pattern.struct.proxy;

/**
 * Created by chensk on 2016/12/20.
 */
public class ProxyImage implements Image{
    private Image image;

    public ProxyImage(String fileName) {
        this.image = new RealImage(fileName);
    }

    @Override
    public void display() {
        image.display();
    }
}
