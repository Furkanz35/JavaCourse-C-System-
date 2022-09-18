package org.csystem.app;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import org.csystem.app.commandprompt.CommandPromptApp;
import org.csystem.app.simulation.ExamSimulationApp;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.math.geometry.Circle;


class App {
    public static void main(String [] args)
    {
        Circle c = new Circle(-2);
        System.out.printf("Radius: %.2f%n", c.getRadius());
        System.out.printf("Area: %.2f%n", c.getArea());
        System.out.printf("Circumference: %.2f%n", c.getCircumference());
        System.out.println("-------------------");

        c.setRadius(4.5);
        System.out.printf("Radius: %.2f%n", c.getRadius());
        System.out.printf("Area: %.2f%n", c.getArea());
        System.out.printf("Circumference: %.2f%n", c.getCircumference());

    }
}
