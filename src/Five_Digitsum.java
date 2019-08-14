import java.util.Scanner;
        //WAP to input any five digit number and then find sum of each digit
public class Five_Digitsum {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter five digit number ");
        int a = scanner.nextInt();
         int sum =0;
         int b;
        while(a>0)
        {
            b = a%10;
            sum = sum + b;
            a = a/10;
         }

        System.out.println("enter the sum of five digit "+sum);

    }
}
