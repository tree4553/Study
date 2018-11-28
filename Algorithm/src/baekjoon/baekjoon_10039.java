package baekjoon;
// 10039ë²? : ?‰ê·? ? ?ˆ˜
// 2017-09-04

import java.util.Scanner;

public class baekjoon_10039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int temp = scan.nextInt();
            if (temp < 40) {
                temp = 40;
            }
            total += temp;
        }
        System.out.println(total/5);
    }
}
