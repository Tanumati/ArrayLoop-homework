import java.util.Scanner;

public class Fivedigits_Reverse {

       ///WAP to input any five digit number and then reverse the number
    public static void  main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the five digit");
        int n = scanner.nextInt();
        int reverse = 0;
        while(n!=0){
            int b = n%10;
            reverse = reverse*10+b;
            n/=10;
        }
        System.out.println("Reverse number  "+reverse);

    }

}
