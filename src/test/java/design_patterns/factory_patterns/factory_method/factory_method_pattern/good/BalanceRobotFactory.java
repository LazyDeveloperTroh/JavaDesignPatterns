package design_patterns.factory_patterns.factory_method.factory_method_pattern.good;

import design_patterns.factory_patterns.factory_method.factory_method_pattern.BalanceRobot;
import design_patterns.factory_patterns.factory_method.factory_method_pattern.Robot;

public class BalanceRobotFactory implements RobotFactory{
    @Override
    public Robot createRobot() {
        return new BalanceRobot();
    }
}
