import java.util.Scanner;

public class Fibonanci_Number {
    //Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the limit");
        int c= scanner.nextInt();
        int n1=0,n2 = 1,n3,i;
        System.out.print("Fibonacci number = "+n1+" "+n2); // printing 0 and 1
        for(i=2;i<c;++i)
        {n3 = n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;

        }
    }
}
