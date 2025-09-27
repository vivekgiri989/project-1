
public class javapattern {

    public static void main(String[] args) {
        // System.out.println("pattern practice by kunam kuswaha");
        pattern1(5);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}