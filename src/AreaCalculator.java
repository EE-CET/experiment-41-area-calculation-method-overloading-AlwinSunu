import java.util.Scanner;

public class AreaCalculator {

    static float calculateArea(float radius) {
        float area = (float) (Math.PI * radius * radius);
        return area;
    }

    static float calculateArea(float length, float breadth) {
        float area = length * breadth;
        return area;
    }

    static double calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        float a = calculateArea(radius);
        System.out.printf("%.2f\n", a);
        
        float b = calculateArea(length, breadth);
        System.out.printf("%.2f\n", b);
        
        double c = calculateArea(base, height);
        System.out.printf("%.2f\n", c);
        
        sc.close();
    }
}
