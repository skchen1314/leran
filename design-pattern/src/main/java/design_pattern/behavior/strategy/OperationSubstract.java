package design_pattern.behavior.strategy;

/**
 * Created by chensk on 2017/1/24.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
