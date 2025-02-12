
import java.util.Scanner;

//Sum values of an array

public class sum_arr{
    
    public static void main(String[] args) {  
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int my_array[] = arr;
         int sum = 0;
         for (int i : my_array)
             sum += i;
         System.out.println("The sum is " + sum);
    }
}