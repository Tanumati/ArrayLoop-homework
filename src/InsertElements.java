import java.util.Arrays;
import java.util.Scanner;

public class InsertElements {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        int[]a= {10,12,30,40,50,60};
        System.out.println("Enter the element");
        int ele = scanner.nextInt();
        System.out.println("Enter your desire position between 1 to "+ a.length);
        int pos = scanner.nextInt();
        for(int i = a.length -1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=ele;
        //for (int i=0;i<a.length;i++){
            //System.out.println(a[i]);
        //}
        System.out.println(Arrays.toString(a));
    }

}
