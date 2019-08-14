import java.util.Scanner;

public class CountString {
    // WAP to enter any String and count total number of 'a' in that String.
    public static void main (String[]args){
        //input value

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String name:");
        String name = scanner.next();
        char a='a';
        char a1= 'A';
        System.out.println("the total a in "+name+ " is");
        int count =0;
        for(int i=0;i<name.length();i++) {
            if ((a == name.charAt(i))||(a1==name.charAt(i)))
                count++;
        }

            System.out.println(count);

    }
}

