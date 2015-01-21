public class TestCircle {        // save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea()+ 
         " and it's color is "+ c1.getColor());
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea() + 
         " and it's color is "+ c2.getColor());
      
      Circle c3=new Circle(3.0,"red");
      // Use the dot operator to invoke methods of instance c3.
      System.out.println("The circle has radius of " 
         + c3.getRadius() + " and area of " + c3.getArea()+ 
         " and it's color is "+ c3.getColor());
      // c3.radius=5.0
      // The error shown is because the variable is private, it saves 
      // the variable from been changed if we don't create a method
      // to do so.
      
      // trial after creating setRadius and setColor methods
      c3.setRadius(4.0);
      c3.setColor("green");
      System.out.println("The circle has radius of " 
    	         + c3.getRadius() + " and area of " + c3.getArea()+ 
    	         " and it's color is "+ c3.getColor());
      
      Circle c4=new Circle(5.0);
      System.out.println(c4.toString()); 
      
   }
}