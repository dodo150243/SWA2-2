package com.swa.oop3;

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape shape;
        
        
        Square squ = new Square();
        shape = squ;
        squ.setValues(10, 5);
        System.out.println("Area of Square : " + shape.getArea());
        
        
  
        Triangle tri = new Triangle();    
        shape = tri;
        tri.setValues(10,3);
        System.out.println("Area of triangle : " + shape.getArea());
        
        
        
        Circle cir = new Circle();
        shape = cir;
        cir.setValues(10);
        System.out.println("Area of Circle : " + shape.getArea());
    }
}