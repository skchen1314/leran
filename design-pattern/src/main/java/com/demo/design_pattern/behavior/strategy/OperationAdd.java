package com.demo.design_pattern.behavior.strategy;

/**
 * Created by chensk on 2017/1/24.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
