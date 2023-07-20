package model;

import calculator.Calculator;
import point.Point;

public class Model implements Calculator {
    public double calculateDistance(Point p1, Point p2) {
        double dist = Math.sqrt(Math.pow((p2.ycord - p1.ycord), 2) + Math.pow((p2.xcord - p1.xcord), 2));
        return dist;
    }

}
