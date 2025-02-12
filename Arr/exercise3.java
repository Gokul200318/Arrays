
import java.util.Scanner;

// Test if an array contains a specific value
public class exercise3{

    public static boolean cont(int[]arr,int element){
        for(int n:arr){
           if (element==n) {
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the arr size");
        
        int n = scan.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the specific element");
        int element = scan.nextInt();
        int element_2 = scan.nextInt();

        boolean result = (cont(arr,element));
        System.out.println("array contain a specific value so" +" " + result);

        boolean result_2 = (cont(arr,element_2));
        System.out.println("array contain a specific value so" +" " + result_2);
    }
}