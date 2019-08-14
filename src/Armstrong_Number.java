import java.util.Scanner;

public class Armstrong_Number {

    ///WAP to input any number and check if it is Armstrong number or not

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = scanner.nextInt();
        int c =0;
        int tem;
        int a;
        tem = n;
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(tem==c){System.out.println("Number is Armstrong");}
         else {System.out.println("Not Armstrong number");}
    }

}
