package SW_ExpertAcademy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SW_2050 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int length = input.length();
		for(int i = 0 ; i < length; i++) {
			
			bw.write(((int)input.charAt(i)-64)+" ");
		}
		bw.flush();
	}

}
