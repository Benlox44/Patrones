package StructuralPatterns.Facade;

import jdk.jfr.Percentage;

public class RobotFacade {

    RobotColor robotColor;
    RobotMetal robotMetal;
    RobotBody robotBody;

    public RobotFacade() {
        robotColor = new RobotColor();
        robotMetal = new RobotMetal();
        robotBody = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("Creation of the Robot Start");
        robotColor.setColor(color);
        robotMetal.setMetal(metal);
        robotBody.createBody();
        System.out.println("Robot Creation End");
        System.out.println();
    }

    @Override
    public String toString() {
        return robotColor.getColor() + " " + robotMetal.getMetal();
    }
}
