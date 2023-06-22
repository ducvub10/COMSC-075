
import java.util.Scanner;
public class Lab10 {

    
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        while(true) {
            System.out.print("Enter 2 integers: ");        
            try {
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                
                break;
            } 
            catch (java.util.InputMismatchException ime) {
               System.out.printf("Wrong inputs. Try again! \n");
               scanner.nextLine(); 
            }
            
        } 
        System.out.printf("The sum is " + (num1+num2));
    }
       
    
    
    }
    

