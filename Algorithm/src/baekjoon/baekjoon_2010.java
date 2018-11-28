package baekjoon;
import java.util.Scanner;
public class baekjoon_2010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multi = scan.nextInt(),result=1;
        int[] plug = new int[multi];
        for(int i = 0 ; i < multi; i++){
            plug[i] = scan.nextInt();
        }
        for(int i = 0 ; i < multi; i ++){
            if(plug[i]!=1){
                result = result+plug[i]-1;
            }
        }
        System.out.println(result);
    }
}