package baekjoon;
import java.util.StringTokenizer;
import java.util.Scanner;

public class baekjoon_2912 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noem, color, picture, start, end, big;
        noem = scan.nextInt();
        color = scan.nextInt();
        int[] count = new int[color];
        scan.nextLine();
        int[] hat = new int[noem];
        String temp = scan.nextLine();
        StringTokenizer token = new StringTokenizer(temp);
        for (int i = 0; i < noem; i++) {
            hat[i] = Integer.parseInt(token.nextToken());
        }
        picture = scan.nextInt();
        for (int i = 0; i < picture; i++) {
            for (int j = 0; j < color; j++) {
                count[j] = 0;
            }
            start = scan.nextInt();
            end = scan.nextInt();
            for (int j = start; j < end + 1; j++) {
                int num = hat[j - 1];
                count[num - 1]++;
            }
            int biggest = count[0];
            big = 1;
            for (int j = 0; j < color; j++) {
                if (biggest < count[j]) {
                    biggest = count[j];
                    big = j + 1;
                }
            }
            double temp1 = end - start + 1;
            double temp2 = biggest / temp1;
            if (temp2 > 0.5) {
                System.out.println("yes " + big);
            } else {
                System.out.println("no");
            }
        }
    }
}