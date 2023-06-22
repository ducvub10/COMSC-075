



import java.util.Scanner;

public class KietQuanLab01b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilograms;
        
        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();
        
        kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds in kilograms is: " + kilograms + " kilograms");
    }
}
