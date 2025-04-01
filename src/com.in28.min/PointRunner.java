package com.in28.min;

public class PointRunner {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        p1.move(1, 1);  // After this move, the point p1 should be at (4, 5)

        double distance = p1.distanceTo(p2);  // The distance from p1 to p2 should be sqrt((6-4)^2 + (8-5)^2) = sqrt(4+9) = sqrt(13) ≈ 3.60555
        System.out.println(distance);
    }
}
