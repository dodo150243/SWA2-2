package com.swa.oop3;

public class Square  extends Shape
{
	 private double high;  
	   private double Wide;  

	   public void setValues(double high, double Wide)
	   {
	      this.high = high;
	      this.Wide = Wide;
	   }

	   public double getHigh() 
	   {
	       return high;
	   }

	   public double getWide() 
	   {
	       return Wide;
	   } 

    public double getArea()
    {
    	this.area =getHigh() * getWide();
        return this.area;
    }
}