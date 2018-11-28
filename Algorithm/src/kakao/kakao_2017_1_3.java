package kakao;
import java.util.HashMap;
import java.util.Map;

public class kakao_2017_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
		solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
		
	}
	
	public static int solution(int n, String[] input) {
		int result = 0 ;
		
		if(n == 0) {
			return input.length*5;
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < input.length; i++) {
			
			String target = input[i];
			if(map.containsKey(target.toUpperCase())) {
				result ++;
			}
			else {
				result += 5;
				
				if(n > map.size()) {
					map.put(target.toUpperCase(), map.size() +1);
				}
				String delkey = "";
				for(String key : map.keySet()) {
					if(map.get(key) == 1) {
						delkey = key;
					}
					else {
						map.put(key, map.get(key)-1);
					}
				}
				map.remove(delkey);
				map.put(target.toUpperCase(), map.size() + 1);
			}
			
		}
		
		System.out.println(result);
		return result;
	}

}
