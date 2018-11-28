package baekjoon;
import java.util.*;
import java.io.*;

public class baekjoon_7758_timeout {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Log> arr = new LinkedList<>();
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < t ; i ++){
				StringTokenizer input = new StringTokenizer(br.readLine());
				String name = input.nextToken();
				String log = input.nextToken();
				Boolean on_off = false;
				Log temp = null;
				if(log.equals("enter")){
					on_off = true;
				}
				else{
					on_off = false;
				}
				if(on_off){
					Log a = new Log(name,on_off);
					arr.add(a);
				}
				else{
					Iterator<Log> iterator = arr.iterator();
					while(iterator.hasNext()){
						Log temp_log = iterator.next();
						if(temp_log.name.equals(name)){
							arr.remove(temp_log);
							break;
						}
					}
				}
			}
			String[] result = new String[arr.size()];
			for(int i = 0 ; i < arr.size(); i++){
				result[i] = arr.get(i).name;
			}
			Arrays.sort(result);
			for(int i = 0 ; i < result.length; i++){
				bw.write(result[i]+"\n");
			}
			bw.flush();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			bw.write("Wrong input\n");
			e.printStackTrace();
		}
		
	}
	public static class Log{
		private String name="";
		private boolean now_on = true;
		public Log(String name, Boolean now_on){
			this.name = name;
			this.now_on = now_on;
		}
	}
}
