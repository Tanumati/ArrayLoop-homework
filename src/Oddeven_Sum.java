import java.util.Scanner;

public class Oddeven_Sum {
    // WAP to input any digit number then count total no of odd and even digit and
    //ind sum of them

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit number");

         int number , i,evenSum =0,oddSum = 0;
         number = scanner.nextInt();
         for (i=0;i<=number;i++)
         {
             if(i%2==0)
             {evenSum = evenSum +i;}
              else
                  {oddSum = oddSum +i;}

         }
         System.out.println("\n the sum of even numbers up to "+ number +" ="+evenSum);
         System.out.println("\n The sum of odd numbers up to  "+number +" ="+oddSum);
    }
}
