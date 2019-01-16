package SW_ExpertAcademy;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SW_2043 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = scan.nextInt()- scan.nextInt() + 1;
		bw.write(String.valueOf(result));
		bw.flush();
	}

}
