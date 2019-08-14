
  //WAP to enter any String and count how many total number of words and total
      //  number of spaces in that sentence

  import java.util.Scanner;

  public class Words_Spaces{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st = scanner.next();
        int count =0;

        for (int i = 0;i<st.length();++i) {
            if (st.charAt(i)!= ' ')
                count++;
        }
        System.out.println("Number of space ="+count);
        System.out.println("Number of words ="+(count+1));
    }

}




