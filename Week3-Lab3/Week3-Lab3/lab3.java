

import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class lab3 {

    
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat();
       df.setMaximumFractionDigits(2);
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the length from the center to the vertex: ");
       
       double ver = input.nextDouble(), area, s;
       
       s = 2 * ver * Math.sin(Math.PI/5);
      
       double areaNum = 5 * Math.pow(s, 2);
       double areaDe = 4 * Math.tan(Math.PI /5);
       area = areaNum/areaDe;
       
       System.out.println("The area of the pentagon is " + df.format(area));
    }
    
}
