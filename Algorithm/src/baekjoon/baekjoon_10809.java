package baekjoon;
// 10809ë²? : ?•Œ?ŒŒë²? ì°¾ê¸°
// 2017-09-04

import java.util.Scanner;
public class baekjoon_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //?•Œ?ŒŒë²? ?œ„ì¹˜ë?? ???ž¥?•  ë°°ì—´ ?„ ?–¸, -1ë¡? ê°? ì´ˆê¸°?™”
        int[] location = new int[26];
        for(int i = 0 ; i < 26 ; i++){
            location[i] = -1;
        }
        //ìµœì´ˆ?˜ ?“±?ž¥ ?œ„ì¹˜ë§Œ?„ ???ž¥?•˜ê¸? ?œ„?•´ ì¡°ê±´ë¬¸ì„ ê±¸ì–´ì¤¬ë‹¤.
        //?ž…? ¥ê°’ì˜ ?•„?Š¤?‚¤ì½”ë“œê°? - a(97)?„ ëº? ?žë¦¬ì— ?œ„ì¹˜ë?? ???ž¥?•œ?‹¤.
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
