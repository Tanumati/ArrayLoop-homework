import java.sql.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[]args){
       // Sort by number and string in arrays
        String[]a = {"Belgium","India","Pakistan","France","Egypt","Cape verde"};
        System.out.println("Enter the Country name  "+Arrays.toString(a));
        Arrays.sort(a);
        int[]b = {45,89,40,23,65,75};
        System.out.println("Enter the number "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Enter the Sort by A to z "+Arrays.toString(a));
        System.out.println("Enter the Sort by "+Arrays.toString(b));
    }
}
