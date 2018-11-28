package baekjoon;
// 1152ë²? : ?‹¨?–´?˜ ê°œìˆ˜
import java.util.Scanner;
public class baekjoon_1152 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int count = 0;
        for(int i = 0; i < input.length()-1; i++){
            if(input.charAt(i) != ' ' && input.charAt(i+1) == ' '){
                count++;
            }
        }
        if(input.charAt(input.length()-1) == ' '){
            System.out.println(count);
        }else if(input.charAt(input.length()-1) != ' '){
            System.out.println(count+1);
        }else if(count == 0){
            System.out.println(0);
        }
    }
}

