package design_pattern.struct.proxy.demo3;

/**
 * Created by chensk on 2016/8/11.
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want rent the house!");
    }

    @Override
    public void hello(String name) {
        System.out.println("hello " + name + "!");
    }
}
