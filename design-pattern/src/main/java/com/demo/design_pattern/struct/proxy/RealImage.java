package com.demo.design_pattern.struct.proxy;

/**
 * Created by chensk on 2016/12/20.
 */
public class RealImage implements  Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println(fileName + " display");
    }

    private void loadFromDisk(){
        System.out.println(fileName + " load from disk");
    }
}
