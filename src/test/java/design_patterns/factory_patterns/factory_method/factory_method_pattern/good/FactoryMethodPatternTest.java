package design_patterns.factory_patterns.factory_method.factory_method_pattern.good;

import design_patterns.factory_patterns.factory_method.factory_method_pattern.BalanceRobot;
import design_patterns.factory_patterns.factory_method.factory_method_pattern.PowerRobot;
import design_patterns.factory_patterns.factory_method.factory_method_pattern.Robot;
import design_patterns.factory_patterns.factory_method.factory_method_pattern.SpeedRobot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodPatternTest {
    
    @Test
    @DisplayName("로봇 팩토리 별로 객체가 정상적으로 생성되었는지 확인")
    public void robotFactory() {
        RobotFactory powerRobotFactory = new PowerRobotFactory();
        Robot powerRobot = powerRobotFactory.createRobot();

        RobotFactory speedRobotFactory = new SpeedRobotFactory();
        Robot speedRobot = speedRobotFactory.createRobot();

        RobotFactory balanceRobotFactory = new BalanceRobotFactory();
        Robot balanceRobot = balanceRobotFactory.createRobot();

        assertEquals(powerRobot.getClass(), PowerRobot.class);
        assertEquals(speedRobot.getClass(), SpeedRobot.class);
        assertEquals(balanceRobot.getClass(), BalanceRobot.class);
    }
}
