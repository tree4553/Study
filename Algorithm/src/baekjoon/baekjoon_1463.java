package baekjoon;
import java.util.Scanner;

class baekjoon_1463 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // n is input value
        int n = scan.nextInt();
        // make array for dynamic programming
        int[] count = new int[n + 1];
        // initialize array [0],[1]
        count[0] = 0;
        count[1] = 0;
        // bottom up dynamic programming
        for (int i = 2; i <= n; i++) {
            int a = 1000000, b = 1000000, c = 1000000;
            if (i % 3 == 0) {
                a = 1 + count[i / 3];
            }
            if (i % 2 == 0) {
                b = 1 + count[i / 2];
            }
            c = 1 + count[i - 1];
            // min is minimum value of count
            int min = c;
            // if sentence for the minimum value
            if (b < c && b != 0) {
                min = b;
            }
            if (a < c && a != 0) {
                min = a;
            }
            count[i] = min;
        }
        System.out.println(count[n]);
    }
}