package StructuralPatterns.Facade;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Pattern Demo");

        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.constructRobot("Green", "Iron");

        RobotFacade robotFacade2 = new RobotFacade();
        robotFacade2.constructRobot("Blue", "Steel");

        System.out.println(robotFacade1);
        System.out.println(robotFacade2);

    }
}
