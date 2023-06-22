


import java.util.Scanner;

public class sortNum {
    
    public static void displaySortedNumbers(double num1,double num2, double num3){
        double sub1 = num1, sub2 = num2, sub3 = num3;
        if (num1 > num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3){
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(sub1 + "," + sub2 + "," + sub3 + " is re-arranged into: " + num1 + "," + num2 + "," + num3);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter three numbers: ");
        displaySortedNumbers(input.nextDouble(),input.nextDouble(),input.nextDouble());
    }
}
