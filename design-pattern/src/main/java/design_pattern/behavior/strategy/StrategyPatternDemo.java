package design_pattern.behavior.strategy;

/**
 * Created by chensk on 2017/1/24.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStragety(3, 2));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStragety(3, 2));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStragety(3, 2));

    }
}
