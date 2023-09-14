/**
 * ITSC 1213 
 * The Circle class represents a circle with a radius and color.
 */

public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;

   // The default constructor with no argument.
   // It sets the radius and color to their default value.
   public Circle() {
      radius = 1.0;
      color = "red";
   }

   // 2nd constructor with given radius and color
   public Circle(double r, String clr) {
      radius = r;
      color = clr;
   }

   
   /** 
    * @return double
    */
   // A public method for retrieving the radius
   public double getRadius() {
     return radius;
   }

   
   /** 
    * @return double
    */
   // A public method for retrieving the area of circle
   public double getArea() {
     double area = calculateArea();
      return area;
   }

   
   /** 
    * @return double
    */
   // A private method for computing the area of circle
   private double calculateArea(){
     return radius*radius*Math.PI;
   }
}