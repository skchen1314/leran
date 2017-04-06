package design_pattern.struct.facade;

/**
 * Created by chensk on 2017/1/9.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
}
