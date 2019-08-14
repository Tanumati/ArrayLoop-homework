import java.util.Scanner;

public class Print_Multiplication {
    // Write a program in Java to display the multiplication table of a given integer.
    //For eg:
    //Input the number (Table to be calculated) : Input number of terms : 5 Expected
    //Output

    public static void main(String[]args){
        int i , j ,t =20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        i= scanner.nextInt();
        System.out.println("Enter the second value");
        j= scanner.nextInt();

        do {
            System.out.println((i+" *" + j  +"= "+ (i * j)));
            i++;
        }
        while (i<=t);
    }

}
