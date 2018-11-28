package kakao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2017년 카카오 코딩테스트 1차 2번 문제
public class kakao_2017_1_2 {
	static int[] sum = new int[3];
	
	public static void main(String [] args) {
		
		solution("1S2D*3T");
		solution("1D2S#10S");
		solution("1D2S0T");
		solution("1S*2T*3S");
		solution("1D#2S*3S");
		solution("1T2D3D#");
		solution("1D2S3T*");
		
	}
	
	
	public static int solution(String input) {
		int answer = 0;
		String regex = "(\\d{1,2}[S|T|D][*|#]{0,1})";
		Pattern p = Pattern.compile(regex+regex+regex);
		Matcher m = p.matcher(input);
		m.find();
		for(int i = 1; i <= m.groupCount(); i++) {
			Pattern p1 = Pattern.compile("(\\d{1,2})([S|T|D])([*|#]{0,1})");
			Matcher m1 = p1.matcher(m.group(i));
			m1.find();
			sum[i-1] = (int) Math.pow(Integer.parseInt(m1.group(1)),getPow(m1.group(2)));
			setOption(i,m1.group(3));
		}
		
		
		answer = sum[0]+sum[1]+sum[2];
		System.out.println(input+"\t"+answer);
		return answer;
	}
	
	public static void setOption(int idx, String m) {
		if("*".equals(m)) {
			sum[idx -1] *= 2;
			if(idx > 1) {
				sum[idx-2] *= 2;
			}
		}
		else if("#".equals(m)) {
			sum[idx-1] *= -1;
		}
	}
	
	public static int getPow(String pow) {
		int num = 0 ;
		if("S".equals(pow)) {
			num = 1;
		}
		else if("D".equals(pow)) {
			num = 2;
		}
		else if("T".equals(pow)) {
			num = 3;
		}
		return num;
	}
	
}
