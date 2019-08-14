import java.util.Scanner;

public class Natural_Number {
    //Write a program in Java to display n limit of natural numbers and their sum.
   // Expected Output :
    //The first n natural numbers are : 1 2 3 4 5 6 7
    //The Sum of Natural Number upto n limit : 28
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scanner.nextInt();
        int sum =0;
        int i=1;
        while(i<=a){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+ a +" number is "+ sum);
    }

}
