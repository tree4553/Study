package baekjoon;
// 2675Î≤? : Î¨∏Ïûê?ó¥ Î∞òÎ≥µ
// 2017-09-06

import java.util.Scanner;

public class baekjoon_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < line; i++) {
            int n = scan.nextInt();
            String input = scan.next();
            String output = "";
            for (int j = 0; j < input.length(); j++) {
                for (int k = 0; k < n; k++) {
                    output += input.charAt(j);
                }
            }
            System.out.println(output);
        }
    }
}
