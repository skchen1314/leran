package design_pattern.behavior.strategy;

/**
 * Created by chensk on 2017/1/24.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStragety(int a, int b) {
        return  strategy.doOperation(a, b);
    }
}
