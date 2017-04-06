package com.demo.design_pattern.struct.decorator;

/**
 * Created by chensk on 2016/12/20.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Rectangle rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(rectangle);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("Rectangle with normal border");
        rectangle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
