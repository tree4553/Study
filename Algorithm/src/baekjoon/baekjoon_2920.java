package baekjoon;
// 2920ë²? : ?Œê³?
// 2017-09-04

import java.util.Scanner;

public class baekjoon_2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean scale = false;
        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = scan.nextInt();
        }
        if (input[0] == 1) {
            scale = ascending(input);
            if (scale == true) {
                System.out.println("ascending");
            }else{
                System.out.println("mixed");
            }
        } else if (input[0] == 8) {
            scale = descending(input);
            if (scale == true) {
                System.out.println("descending");
            }else{
                System.out.println("mixed");
            }
        } else {
            System.out.println("mixed");
        }
    }

    public static boolean ascending(int input[]) {
        for (int i = 1; i < 8; i++) {
            if (input[i] != input[i - 1] + 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean descending(int input[]) {
        for (int i = 1; i < 8; i++) {
            if (input[i] != input[i - 1] - 1) {
                return false;
            }
        }
        return true;
    }
}
