package com.company;

public class Main {

    public static void main(String[] args) {
	    Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape heptagon = new Heptagon();
        Shape pentagon = new Pentagon();
        Shape square = new Square();
        Shape[]shapes = {circle, pentagon, heptagon, triangle,square};
        for (Shape shape : shapes) {
           shape.pain();
        }

    }
}
