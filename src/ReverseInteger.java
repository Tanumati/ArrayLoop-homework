import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[]rgs){
        //create a scanner object fot taking input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of elements");
        // capture the number of elements in to num
        int num = scanner.nextInt();
        // create an array with size num
        int a[]=new int[num];
        //read the elements in arrays
        System.out.println("enter the elements in to array");
        for(int i =0;i<num;i++){
            a[i]= scanner.nextInt();
        }
        System.out.println("Printing the reverse elements in the array");
        //10,20,30,40
        for(int i =a.length-1;i>=0;i--)
            System.out.println(a[i]);
    }
}
