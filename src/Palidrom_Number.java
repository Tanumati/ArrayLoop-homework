import java.util.Scanner;

public class Palidrom_Number {
    //WAP to input any number and check if it is Palindrome or not

    public static void main(String[]args){
        int r,sum =0,temp;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number  Value");
        int n= scanner.nextInt();
        temp =n;
        while(n>0)
        {
            r=n%10; // geting remainders
            sum= (sum*10)+r;
            n=n/10;
        }

        if( temp==sum)
        {
            System.out.println("Numbers is palindrom");
        }
        else
            {
                System.out.println("Not palindrom numbers");
            }

    }
}
