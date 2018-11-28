package baekjoon;
import java.util.Scanner;

public class baekjoon_1912 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int max = -1000;
        int k = 0;
        for (int i = n; i > 0; i--) {
            int a = 0;
            for (int j = 0; k + j < n; j++) {
                a = a + array[k + j];
                if (max < a) {
                    max = a;
                }
            }
            k++;
        }
        System.out.println(max);
    }
}