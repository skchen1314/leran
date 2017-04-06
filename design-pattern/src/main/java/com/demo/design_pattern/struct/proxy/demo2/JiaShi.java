package com.demo.design_pattern.struct.proxy.demo2;

/**
 * Created by chensk on 2016/12/20.
 */
public class JiaShi implements KindWoman {
    @Override
    public void happyWithMan() {
        System.out.println("贾氏和男人在做那个...");

    }

    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼...");

    }
}
