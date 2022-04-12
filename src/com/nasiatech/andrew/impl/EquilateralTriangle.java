package com.nasiatech.andrew.impl;

public class EquilateralTriangle extends Triangle{
    public double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public EquilateralTriangle() {
    }
    public double area(double side){
        Triangle t = new Triangle();
        double h = (Math.sqrt(3) * side) * 0.5;
        t.setHeight(h);
        return t.area(side, h);
    }

    public static void main(String[] args){

        EquilateralTriangle e = new EquilateralTriangle();
        System.out.println(e.area(2));
    }
}
