import java.util.*;



abstract class GeometricObject{
    private String color;
    private boolean filled;
    
    public GeometricObject(){
        
    }
    
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
}

 class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    
    public double getPeri(){
        return side1 + side2 + side3;
    }
    
}

public class TriangleTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print ("Enter 3 sides: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        
        System.out.print("Enter color: ");
        String color = scanner.next();
        
        System.out.print("Is it filled? ");
        boolean filled = scanner.nextBoolean();
        
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        
        System.out.println("The perimeter of the triangle is " + triangle.getPeri());
        System.out.println("The Area of the triangle is " + triangle.getArea());
        System.out.println("The color of the triangle is " + triangle.getColor());
        System.out.println("Is the triangle filled? " + triangle.isFilled());
    }
}

