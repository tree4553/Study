package baekjoon;
// 10809�? : ?��?���? 찾기
// 2017-09-04

import java.util.Scanner;
public class baekjoon_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //?��?���? ?��치�?? ???��?�� 배열 ?��?��, -1�? �? 초기?��
        int[] location = new int[26];
        for(int i = 0 ; i < 26 ; i++){
            location[i] = -1;
        }
        //최초?�� ?��?�� ?��치만?�� ???��?���? ?��?�� 조건문을 걸어줬다.
        //?��?��값의 ?��?��?��코드�? - a(97)?�� �? ?��리에 ?��치�?? ???��?��?��.
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
