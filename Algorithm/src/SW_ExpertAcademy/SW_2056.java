package SW_ExpertAcademy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SW_2056 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			String month_string = Character.toString(input.charAt(4)) + Character.toString(input.charAt(5));
			int month_int = Integer.parseInt(month_string);
			String day_string = Character.toString(input.charAt(6)) + Character.toString(input.charAt(7));
			int day_int = Integer.parseInt(day_string);
			if (month_int > 12 || month_int < 1) {
				bw.write("#" + (i + 1) + " -1\n");
				continue;
			}
			if (day_int > 31 || day_int < 1) {
				bw.write("#" + (i + 1) + " -1\n");
				continue;
			}
			if(month_int == 2) {
				if (day_int > 28) {
					bw.write("#" + (i + 1) + " -1\n");
					continue;
				}
			}
			if(month_int == 4 || month_int == 6 || month_int == 9 || month_int == 11) {
				if (day_int > 30) {
					bw.write("#" + (i + 1) + " -1\n");
					continue;
				}
			}
			String year_string = input.substring(0, 4);
			bw.write("#"+(i+1)+" "+year_string+"/"+month_string+"/"+day_string+"\n");
		}
		bw.flush();
	}

}
