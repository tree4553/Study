package SW_ExpertAcademy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW_2058 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		while(n/10 != 0) {
			result += n%10;
			n /= 10;
		}
		result += n;
		System.out.println(result);
	}

}
