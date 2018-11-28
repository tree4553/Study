package baekjoon;
// 1157ë²? : ?‹¨?–´ ê³µë?
// 2017-09-06

import java.util.Scanner;

public class baekjoon_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.toUpperCase();
        int[] count = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count[j]++;
                    break;
                }
            }
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                temp = i;
            }
        }
        int x = 0;
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                x++;
            }
        }
        if (x == 1) {
            System.out.println(input.charAt(temp));
        } else {
            System.out.println("?");
        }
    }
}
