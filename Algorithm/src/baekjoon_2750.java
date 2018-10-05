import java.io.*;
public class baekjoon_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int T = Integer.parseInt(br.readLine());
			int[] arr = new int[T];
			for(int i = 0 ; i < T ; i ++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			arr = solution(arr);
			
			for(int i = 0 ; i < T ; i ++) {
				bw.write(arr[i]+"\n");
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static int[] solution (int[] input) {
		int temp = 0 ;
		for(int i = 0 ; i < input.length ; i ++) {
			for(int j = 0 ; j < input.length ; j++) {
				if(input[i] < input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}
}
