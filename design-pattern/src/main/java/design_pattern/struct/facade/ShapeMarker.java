package design_pattern.struct.facade;

/**
 * Created by chensk on 2017/1/9.
 */
public class ShapeMarker {
    private Rectangle rectangle;
    private Square square;
    private Circle circle;

    public ShapeMarker() {
        this.rectangle = new Rectangle();
        this.square = new Square();
        this.circle = new Circle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
