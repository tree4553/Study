package SW_ExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class SWEA_2971{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
       	for(int i = 0 ; i < T ; i++){
       		int result = 0;
       		StringTokenizer st = new StringTokenizer(br.readLine());
       		for(int j = 0 ; j < 10 ; j++){
       	   	  result += Integer.parseInt(st.nextToken());
       		}
            if(result%10 >4){
                result = result/10+1;
            }else{
        		result /= 10;
            }
            bw.write("#"+(i+1)+" "+String.valueOf(result)+"\n");
    	}
        bw.flush();
	}
}