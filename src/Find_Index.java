import java.util.Scanner;

public class Find_Index {
    //Find the index og array elements
    public static void  main(String[]args){
        int[]a = {20,36,78,100,648,};
        System.out.println("Enter the Value and find the index");
        Scanner scanner =  new Scanner(System.in);
        int b = scanner.nextInt();
        int i;
         for (i=0;i<a.length;i++)
         {
             if (b==a[i])
             {
                 System.out.println("Find the index value  "+ i);
             }

         }
    }
}
