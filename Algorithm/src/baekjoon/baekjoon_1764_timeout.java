package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_1764_timeout {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] arr1 = new String[Integer.parseInt(st.nextToken())];
		String[] arr2 = new String[Integer.parseInt(st.nextToken())];
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0 ; i < arr1.length; i++){
			arr1[i] = br.readLine();
		}
		for(int i = 0 ; i < arr2.length; i++){
			arr2[i] = br.readLine();
		}
		for(int i = 0 ; i < arr1.length; i++){
			for(int j = 0 ; j < arr2.length; j++){
				if(arr1[i].equals(arr2[j])){
					result.add(arr1[i]);
					break;
				}
			}
		}
		String[] temp = result.toArray(new String[result.size()]);
		Arrays.sort(temp);
		System.out.println(temp.length);
		for(int i = 0 ; i < temp.length; i++){
			System.out.println(temp[i]);
		}
	}

}
