import java.util.Scanner;

public class DuplicateElements {
    // Duplicate value of an array of integer value
    public static void main(String[]args){
        int a[]= {2,3,5,6,3};
        for (int i =0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if((a[i]==a[j])&&(i!=j)){
                    System.out.println("Duplicate value  "+a[j]);
                }
            }
        }

    }
}
