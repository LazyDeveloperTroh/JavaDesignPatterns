package design_patterns.factory_patterns.factory_method.factory_method_pattern.good;

import design_patterns.factory_patterns.factory_method.factory_method_pattern.Robot;
import design_patterns.factory_patterns.factory_method.factory_method_pattern.SpeedRobot;

public class SpeedRobotFactory implements RobotFactory{
    @Override
    public Robot createRobot() {
        return new SpeedRobot();
    }
}
