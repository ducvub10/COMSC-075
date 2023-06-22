


import java.util.Scanner;
import java.util.ArrayList;
public class studentHighest {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     ArrayList<String> names = new ArrayList<>(); 
     ArrayList<Integer> grades = new ArrayList<>();
     int highScore;
     int indexOfhighScore = 0;
     System.out.print ("Enter the number of students: ");
     int numStu = input.nextInt();   
     for (int i = 0; i < numStu; i++){
         System.out.print("Enter name: ");
         names.add(input.next());
         System.out.print("Enter grade: ");
         grades.add(input.nextInt());
    }
     highScore = grades.get(0);
     for (int j = 0; j < numStu; j++){
         if (highScore < grades.get(j)){
             highScore = grades.get(j);
             indexOfhighScore = j;
     }
}
     System.out.println(names.get(indexOfhighScore) + " has the highest score of " + highScore);
    }
}
