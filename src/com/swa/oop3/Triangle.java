package com.swa.oop3;

public class Triangle extends Square
{ 
   
    public double getArea() 
    {
    	this.area = (getHigh() * getWide()) / 2;
    	return this.area; 
    }
}   