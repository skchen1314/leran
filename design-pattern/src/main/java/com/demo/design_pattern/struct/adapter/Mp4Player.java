package com.demo.design_pattern.struct.adapter;

/**
 * Created by chensk on 2016/12/20.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing here
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file. Name: " + fileName);
    }
}
