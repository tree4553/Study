package SW_ExpertAcademy;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SW_2027 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < 5; i++) {
			String temp = "";
			for (int j = 0; j < 5; j++) {
				if(j==i) {
					temp+="#";
				}else {
					temp+="+";
				}
			}
			bw.write(temp+"\n");
		}
		bw.flush();
	}

}
