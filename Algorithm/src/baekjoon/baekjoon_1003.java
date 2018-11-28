package baekjoon;
import java.util.Scanner;
public class baekjoon_1003 {
	static Scanner scan = new Scanner(System.in);
	static int zero = 0 , one = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scan.nextInt();
		for(int i = 0 ; i < T ; i ++) {
			int n = scan.nextInt();
			System.out.println(solution(n));
		}
		return ;
	}
	public static String solution(int n) {
		String answer = "";
		zero = 0 ;
		one = 0 ;
		if(n == 0) {
			answer = "1 0";
			return answer;
		}
		else if(n == 1) {
			answer = "0 1";
			return answer;
		}
		fib(n);
		answer = zero+" "+one;
		return answer;
	}
	public static int fib(int n) {
		if(n == 0) {
			zero++;
			return 0;
		}
		else if(n == 1) {
			one++;
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
}
