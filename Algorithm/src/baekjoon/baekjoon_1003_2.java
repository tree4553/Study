package baekjoon;
import java.util.Scanner;
public class baekjoon_1003_2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scan.nextInt();
		int [] arr = new int[41];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i < 41; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		for(int i = 0 ; i < T ; i++) {
			int n = scan.nextInt();
			if(n == 0) {
				System.out.println("1 0");
			}
			else if(n == 1) {
				System.out.println("0 1");
			}
			else {
				System.out.println(arr[n-2]+" "+arr[n-1]);
			}
		}
	}

}
