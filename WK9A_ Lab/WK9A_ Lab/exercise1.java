
import java.util.*;
public class Lab9 {

    
    public static Stack <Integer> smallestFactors(int num){
        Stack <Integer> stack = new Stack<>();
        
        while(num != 1){
            int j = 0;
            for(int i = 2; i < 10; i++){
                if (num%i == 0){
                    num = num/i;
                    stack.push(i);
                    j = 1;
                    break;
                }
            }
            if (j == 0) {
                stack.push(num);
                break;
            }
        }
        return stack;
    }
    
    public static void printFactors(Stack<Integer> stack){
        int j = stack.size();
        for (int i = 0; i < j; i++) {
            Integer thing = stack.pop();
            System.out.print(thing + " ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printFactors(smallestFactors(num));
    }
    
}
