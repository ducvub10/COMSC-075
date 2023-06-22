



import java.lang.Math;
import java.util.Scanner;
        
public class KietQuanLab01a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type radius: ");
        double radius = input.nextDouble();
        
        
        System.out.print("Type length: ");
        double length = input.nextDouble();
        
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
