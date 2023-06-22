
import java.util.Scanner;

public class Lottery {

    
    private static void Merge (int[] array, int left, int mid, int right){
        int i = left, m = mid+1;
        int[] arrayTemp = new int[array.length];
        for (int z = left; z <= right; z++){
            arrayTemp[z] = array[z];
        }
        for (int k = left; k <= right; k++){
            if (i > mid) array[k] = arrayTemp[m++];
            else if (m > right) array[k] = arrayTemp[i++];
            else if (arrayTemp[i] < arrayTemp[m]) array[k] = arrayTemp[i++];
            else array[k] = arrayTemp[m++];
        }
    }
    
    private static void MergeSort (int[] array, int left, int right){ 
        
        int mid = left + (right - left)/2;
        if (left < right){
         MergeSort(array, left, mid);
         MergeSort(array, mid+1, right);
        
        Merge(array, left, mid, right);
        }
        
    }
    
    private static int countL (int[] array, int key, int left, int right){
        int countL = 0;
        int mid = left + (right-left)/2;
        if (left > right) return countL;
        if (array[mid] < key){
            countL += countL(array, key, mid+1, right);
            countL += (mid-left)+1;
        }
        if (array[mid] > key){
            countL += countL(array, key, left, mid-1);
        }
        return countL;
    }
    
    private static int countR (int[] array, int key, int left, int right){
        int countR = 0;
        int mid = left + (right - left)/2;
        if (left > right) return countR;
        if (array[mid] < key){
            countR += countR(array, key, mid+1, right);
        }
        if (array[mid] > key){
            countR += countR(array, key, left, mid-1);
            countR += (right-mid)+1;
        }
        return countR;
    }
    
    private static int fastCountSegments(int[] starts, int[] ends, int point) {
        MergeSort(starts, 0, starts.length-1);
        MergeSort(ends, 0, ends.length-1);
       
        return countL(starts, point, 0, starts.length-1) + countR(ends, point, 0, ends.length-1);
        
    }

//    private static int[] naiveCountSegments(int[] starts, int[] ends, int[] points) {
//        int[] cnt = new int[points.length];
//        for (int i = 0; i < points.length; i++) {
//            for (int j = 0; j < starts.length; j++) {
//                if (starts[j] <= points[i] && points[i] <= ends[j]) {
//                    cnt[i]++;
//                }
//            }
//        }
//        return cnt;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] starts = new int[n];
        int[] ends = new int[n];
        int[] points = new int[m];
        for (int i = 0; i < n; i++) {
            starts[i] = scanner.nextInt();
            ends[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            points[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++){
            System.out.print((fastCountSegments(starts, ends, points[i]) - n) + " ");
        }
        //use fastCountSegments
//        int[] cnt = naiveCountSegments(starts, ends, points);
//        for (int x : cnt) {
//            System.out.print(x + " ");
//        }
    }
}