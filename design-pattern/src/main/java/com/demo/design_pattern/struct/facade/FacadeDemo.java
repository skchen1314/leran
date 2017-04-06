package com.demo.design_pattern.struct.facade;

/**
 * Created by chensk on 2017/1/9.
 */
public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMarker shapeMarker = new ShapeMarker();
        shapeMarker.drawCircle();
        shapeMarker.drawRectangle();
        shapeMarker.drawSquare();
    }
}
