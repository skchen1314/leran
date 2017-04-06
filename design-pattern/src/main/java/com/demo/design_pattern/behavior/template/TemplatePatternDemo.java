package com.demo.design_pattern.behavior.template;

/**
 * Created by chensk on 2016/12/20.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
