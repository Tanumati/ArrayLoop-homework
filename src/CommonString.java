public class CommonString {
    public static void main(String[] args) {
        String[] t1 = {"mango", "banana", "apple", "Pear"};
        String[] t2 = {"red", "white", "apple", "blue"};

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2.length; j++) {
                if (t1[i].equals(t2[j])) {
                    System.out.println(t1[i]);
                    break;
                }
            }
        }
    }
}