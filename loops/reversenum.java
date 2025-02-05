package loops;
import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        int n1=scan.nextInt();
        int result=0;
        int remainder=0;
        while(n!=0){
            remainder=n%10;
            n=n/10;
            result=result*10+remainder;
        }
        System.out.println(result);
        recrev(n1);
}
static void recrev(int n){
    if(n<10){
        System.out.println(n);
    }
    else{
        System.out.print(n%10); 
        recrev(n/10);
    }
    return;
}

}
