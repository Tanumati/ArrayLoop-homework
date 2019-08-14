import java.util.Scanner;

public class Triangle_Nested {
    // Display right angle triangle of @ using nested for loops
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char  n = scanner.next().charAt(0);
        int i;
        int j ;
        for (i =0;i<=5;i++){

            for (j=0;j<=i;j++)
            {

                System.out.print(n);
            }
            System.out.println();
        }

    }

}
