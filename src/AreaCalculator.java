import java.util.Scanner;

public class AreaCalculator {
    
    // TODO: Define calculateArea(float radius) -> returns area of circle
    // Use Math.PI or 3.14159f for pi

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle

    // TODO: Define calculateArea(double base, double height) -> returns area of triangle
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
   
    float calculateArea(float radius){
        area = (float) (Math.PI*radius*radius);
        return area;
       
    }
    float calculateArea(float length, float breadth){
        float area=length*breadth;
        return area;
       
    }
    double calculateArea(double base, double height){
        double area=.5*base*height;
        return area;
       
    }

   
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read input for Circle (radius)
        // TODO: Read input for Rectangle (length, breadth)
        // TODO: Read input for Triangle (base, height)
        
        // TODO: Call methods and print results formatted to 2 decimal places
        // Hint: Use System.out.printf("%.2f\n", area);
           
        System.out.printf("enter the radius:");
        float radius=sc.nextFloat();
       
        System.out.printf("enter the length and breadth:");
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
       
        System.out.printf("enter the base and height:");
        double base=sc.nextFloat();
        double height=sc.nextFloat();
       
        float a=calculateArea(radius);
        System.out.println("%.2f\n", a);
        float b=calculateArea(length,breadth);
        System.out.println("%.2f\n",b);
        double c=calculateArea(radius);
        System.out.println("%.2d\n",c);
    
    }
}
