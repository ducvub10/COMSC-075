


import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a 3-digits interger: ");
     int num = input.nextInt();
     int reversed = 0, temp;
     
     temp = num;
     while(temp != 0){
         reversed = reversed * 10 + temp % 10;
         temp = temp/10;
     }
     if (reversed == num) {
         System.out.println(num + " is a palindrome.");
     }
     else {
         System.out.println(num + " is not a palindrome.");
     }
    } 
}
