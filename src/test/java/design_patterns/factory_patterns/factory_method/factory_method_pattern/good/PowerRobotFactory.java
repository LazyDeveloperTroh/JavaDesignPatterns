package design_patterns.factory_patterns.factory_method.factory_method_pattern.good;

import design_patterns.factory_patterns.factory_method.factory_method_pattern.PowerRobot;
import design_patterns.factory_patterns.factory_method.factory_method_pattern.Robot;

public class PowerRobotFactory implements RobotFactory {
    @Override
    public Robot createRobot() {
        return new PowerRobot();
    }
}
