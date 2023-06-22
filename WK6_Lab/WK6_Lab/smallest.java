
import java.util.Scanner;

public class smallest {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++){
            array[i] = input.nextDouble();
        }
        System.out.println("The lowest number among the 10 is " + min (array));
    }
    public static double min (double[] array){
        double lowest = array[0];
        for (double i : array){
            if (i < lowest) lowest = i;           
        }
        return lowest;
    }
    
}
