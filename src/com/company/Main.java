package com.company;

public class Main {

    public static void main(String[] args) {
	    Shape circle = new Circle();
       // circle.pain();
        Shape triangle = new Triangle();
       // triangle.pain();
        Shape heptagon = new Heptagon();
       // heptagon.pain();
        Shape pentagon = new Pentagon();
       // pentagon.pain();
        Shape square = new Square();
       // square.pain();
        Shape[]shapes = new Shape[1];
        for (Shape shape : shapes) {
            circle.pain();
            triangle.pain();
            pentagon.pain();
            heptagon.pain();
            square.pain();
        }

    }
}
