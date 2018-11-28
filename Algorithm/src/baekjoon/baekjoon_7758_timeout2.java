package baekjoon;
import java.util.*;
import java.io.*;

public class baekjoon_7758_timeout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<String> arr = new LinkedList<>();
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < t ; i ++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				String temp_name = st.nextToken();
				if(st.nextToken().equals("enter")){
					arr.add(temp_name);
				}else{
					arr.remove(temp_name);
				}
			}
			String[] result = new String[arr.size()];
			Iterator<String> iterator = arr.iterator();
			int i = 0 ;
			while(iterator.hasNext()){
				result[i] = String.valueOf(iterator.next());
				i++;
			}
			Arrays.sort(result);
			for(int j = 0 ; j < result.length; j++){
				bw.write(result[j] + "\n");
			}
			bw.flush();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
