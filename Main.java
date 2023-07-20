import controller.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter cordinated of points:");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();
        Controller contr = new Controller();
        double dist = contr.findDistance(x1, y1, x2, y2);
        System.out.println("Distance between given points is: " + dist);
    }
}
