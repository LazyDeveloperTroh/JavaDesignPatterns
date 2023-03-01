package factorypattern.factorypattern.wrong;

import factorypattern.factorypattern.Robot;

/**
 * 팩토리 메소드의 잘못된 예시
 */
public class WrongFactoryMethodPatternMain {
    public static void main(String[] args) {
        Robot powerRobot = RobotFactory.create("POWER");
        System.out.println("powerRobot = " + powerRobot.getName());

        Robot speedRobot = RobotFactory.create("SPEED");
        System.out.println("speedRobot = " + speedRobot.getName());

        Robot balanceRobot = RobotFactory.create("BALANCE");
        System.out.println("balanceRobot = " + balanceRobot.getName());
    }
}
