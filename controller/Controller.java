package controller;

import point.Point;
import model.Model;

public class Controller{
    public double findDistance(double x1, double y1, double x2, double y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Model modelObj = new Model();
        double result = modelObj.calculateDistance(p1, p2);
        return result;
    }
}
