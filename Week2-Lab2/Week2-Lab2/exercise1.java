

import java.util.Scanner;
public class exercise1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first edge: ");
        double edge1 = input.nextDouble();
        System.out.print("Enter second edge: ");
        double edge2 = input.nextDouble();
        System.out.print("Enter third edge: ");
        double edge3 = input.nextDouble();
        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)){
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter with 3 edges: " + edge1 + ", " + edge2 + ", " + edge3 + " is " + perimeter);
        }
        else System.out.println("Input invalid. Please try again");
    }
    
}
