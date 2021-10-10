package com.samsung;

public class Point2d {
    double x = 0.0;
    double y = 0.0;

    Point2d(double X, double Y) {
        x = X;
        y = Y;
    }

    double L() {
        return Math.sqrt(x * x + y * y);

    }

    double A() {
        return (Math.toDegrees(Math.atan(x / y)));

    }

    void modify(Point2d newPoint2d) {
        x = newPoint2d.x;
        y = newPoint2d.y;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj instanceof Point2d) {
            Point2d p = (Point2d) obj;
            return true;
        } else return false;
    }
}
