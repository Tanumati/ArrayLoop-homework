import java.util.Scanner;

public class DivideBy3and5 {
    //WAP to print the numbers between 1 to 100 which can be divided by 3 and 5
    //separately
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number up to 100");

        int n = scanner.nextInt();
        System.out.println("\n Divided by 3; ");
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0)
                System.out.print(i + " , ");
        }
        System.out.println("\n Divided by 5; ");
        for (int i = 1; i < n; i++)
        {
            if (i % 5 == 0)
                System.out.print(i + " , ");

        }
        System.out.println("\n\n divided by 3and 5");
        for(int i =1;i< n;i++)
        {
            if ( i%3==0 && i%5==0)System.out.print(i+" ,");
        }
        System.out.println("\n");
    }
}
