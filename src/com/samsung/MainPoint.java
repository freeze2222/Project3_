package com.samsung;

public class MainPoint {
    public static void main(String[] args) {

        Point2d point2d = new Point2d(5, 5);
        System.out.println(point2d.A() + " " + point2d.L());

        Point3d_NV point3DNV = new Point3d_NV(5, 5, 5);
        System.out.println(point3DNV.A() + " " + point3DNV.L());
    }
}
