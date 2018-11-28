package baekjoon;

import java.util.Scanner;

public class baekjoon_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), count_5 = 0, count_3 = 0, temp1_5 = 0, temp2_3 = 0, i = 0,
                correct1_5 = 0, correct1_3 = 0, correct2_5 = 0, correct2_3 = 0;
        if (n % 5 == 0) {
            count_5 = n / 5;
        }
        if (n % 3 == 0) {
            count_3 = n / 3;
        }
        while (n > i + 5) {
            i += 5;
            int temp = n - i;
            temp1_5++;
            if (temp % 3 == 0) {
                correct1_5 = temp1_5;
                correct1_3 = temp / 3;
            }
        }
        i = 0;
        while (n > i + 3) {
            i += 3;
            int temp = n - 3;
            temp2_3++;
            if (temp % 5 == 0) {
                correct2_3 = temp2_3;
                correct2_5 = temp / 5;
            }
        }
        if (count_5 == 0 && count_3 == 0 && correct1_5 == 0 && correct1_3 == 0 && correct2_3 == 0 && correct2_5 == 0) {
            System.out.println("-1");
        } else if (count_5 != 0) {
            System.out.println(count_5);
        } else if (correct1_5 != 0 && correct1_3 != 0) {
            System.out.println(correct1_5 + correct1_3);
        } else if (correct2_5 != 0 && correct2_3 != 0) {
            System.out.println(correct2_5 + correct2_3);
        } else if (count_3 != 0) {
            System.out.println(count_3);
        } else {
            System.out.println("-1");
        }
    }
}