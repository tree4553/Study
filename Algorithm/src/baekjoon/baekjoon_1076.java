package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class baekjoon_1076 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] table = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		String temp;
		long result = 0;
		temp = br.readLine();
		for (int i = 0; i < table.length; i++) {
			if (temp.equals(table[i])) {
				result += 10 * i;
				break;
			}
		}
		temp = br.readLine();
		for (int i = 0; i < table.length; i++) {
			if (temp.equals(table[i])) {
				result += i;
				break;
			}
		}
		temp = br.readLine();
		for (int i = 0; i < table.length; i++) {
			if (temp.equals(table[i])) {
				result *= Math.pow(10, i);
				break;
			}
		}
		System.out.println(result);
	}
}
