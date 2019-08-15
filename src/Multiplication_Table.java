import java.util.Scanner;

public class Multiplication_Table {
    //Printing multiplication table using do while loop

    public static void main (String[]args){
        int i,j,t=3;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first digit");
        i= scanner.nextInt();
        System.out.println("enter second digit");
        j= scanner.nextInt();
        do{
            System.out.println((i+" "+ j +" "+(i+j)));
            i++;
           j= j+2;

        }
        while(i<=t);
    }

}
