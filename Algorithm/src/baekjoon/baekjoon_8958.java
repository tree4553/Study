package baekjoon;
//8958�? : OX문제
import java.util.Scanner;
public class baekjoon_8958 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] input = new String[n];
        for(int i = 0 ; i < n ; i++){
            input[i] = scan.nextLine();
        }
        for(int i = 0 ; i < n; i++){
            System.out.println(cal(input[i]));
        }
    }
    public static int cal(String input){
        int result = 0;
        int score = 1;
        for(int i = 0 ; i < input.length()-1; i++){
            if(input.charAt(i) == 'O'){
                result += score;
                if(input.charAt(i+1) == 'O'){
                    score++;
                }else{
                    score = 1;
                }
            }
        }
        if(input.charAt(input.length()-1)=='O'){
            result += score;
        }
        return result;
    }
}
