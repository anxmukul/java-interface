import point.Point;
import model.Model;

import java.util.*; 

public class Main {
    public static void main(String []args){
        System.out.println("Enter cordinated of points:");
        Scanner sc = new Scanner(System.in); 
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Model objModel = new Model();
        double dist = objModel.calculateDistance(p1, p2);
        System.out.println("Distance between given points is: " + dist);
    }
}
