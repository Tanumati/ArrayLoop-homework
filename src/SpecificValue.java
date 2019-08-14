import java.sql.Array;
        import java.util.Scanner;
// this program check in arrays contain a specific value
public class SpecificValue {
    public static void main(String[]args)
    {
        int []a= {25,65,45,68,78,96,32,49};
        System.out.println("Enter the value");
        Scanner scanner= new Scanner(System.in);

        int b=scanner.nextInt();

        for(int i=0;i<a.length;i++)
            {
            if (b == a[i]) {

                System.out.println("Arrays contain this value and its index position is  " + i);
            }
        }
        //System.out.println("No index found ");
    }
}
