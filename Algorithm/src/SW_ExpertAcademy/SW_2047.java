package SW_ExpertAcademy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SW_2047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int length = input.length();
		String result = "";
		for(int i = 0 ; i < length; i++) {
			int temp = (int)input.charAt(i);
			if(temp>96 && temp<123) {
				result += Character.toUpperCase(input.charAt(i));
			}else {
				result += input.charAt(i);
			}
		}
		bw.write(result);
		bw.flush();
	}

}
