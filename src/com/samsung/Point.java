package com.samsung;

public class Point {
    double x = 0.0;
    double y = 0.0;

    Point(double X, double Y) {
        x = X;
        y = Y;
    }

    double L() {
        return Math.sqrt(x * x + y * y);

    }

    double A() {
        return (Math.toDegrees(Math.atan(x / y)));

    }

    void modify(Point newPoint) {
        x = newPoint.x;
        y = newPoint.y;
    }
}
