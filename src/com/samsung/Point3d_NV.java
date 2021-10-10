package com.samsung;

public class Point3d_NV extends Point2d {
    double z;

    Point3d_NV(double X, double Y, double Z) {
        super(X, Y);
        z = Z;
    }

    @Override
    double L() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    double A() {
        return (Math.toDegrees(Math.atan(x / y / z)));
    }
}
