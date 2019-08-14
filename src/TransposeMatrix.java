public class TransposeMatrix {
    public static void main(String[]args) {
        int a;
        int b;
        int[][] c = {{15, 25, 35,40}, {45, 55,65,60}, {75, 85, 95,10}};
        for (a = 0; a <3; a++) {
            for (b = 0; b < 4; b++){
                System.out.print(" "+c[a][b]+" ");}

        System.out.println("");
       }
    }
}
