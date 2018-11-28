package baekjoon;
// 10809λ²? : ??λ²? μ°ΎκΈ°
// 2017-09-04

import java.util.Scanner;
public class baekjoon_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //??λ²? ?μΉλ?? ???₯?  λ°°μ΄ ? ?Έ, -1λ‘? κ°? μ΄κΈ°?
        int[] location = new int[26];
        for(int i = 0 ; i < 26 ; i++){
            location[i] = -1;
        }
        //μ΅μ΄? ?±?₯ ?μΉλ§? ???₯?κΈ? ??΄ μ‘°κ±΄λ¬Έμ κ±Έμ΄μ€¬λ€.
        //?? ₯κ°μ ??€?€μ½λκ°? - a(97)? λΊ? ?λ¦¬μ ?μΉλ?? ???₯??€.
        for(int i = 0 ; i < input.length(); i++){
            if(location[input.charAt(i) - 'a'] == -1) {
                location[input.charAt(i) - 'a'] += i + 1;
            }
        }
        for(int i = 0 ; i < location.length;i++){
            System.out.print(location[i] + " ");
        }
    }
}
