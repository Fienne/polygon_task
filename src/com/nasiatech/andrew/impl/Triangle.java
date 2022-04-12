package com.nasiatech.andrew.impl;

import com.nasiatech.andrew.Polygon;

public class Triangle implements Polygon {
    private double base, height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter(double s1, double s2, double s3) {
        return s1 + s2 + s3;
    }


    public static void main(String[] args){
        Triangle t = new Triangle();
        System.out.println("Area of Triangle: " +t.area(2,5));
        System.out.println("Perimeter of Triangle: "+t.perimeter(2,4,5));
    }
}
