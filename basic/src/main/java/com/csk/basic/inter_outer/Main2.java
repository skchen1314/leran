package com.csk.basic.inter_outer;

/**
 * Created by chensk on 2016/12/13.
 */
public class Main2 {
    public static void main(String[] args) {
        ReferClass r = new ReferClass("QQ");
        ReferClass r2 = new ReferClass("QQ2");
        ReferClass r3 = new ReferClass("QQ3");
        r.printName();
        r2.printName();
        r3.printName();
    }
}
