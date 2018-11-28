package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class baekjoon_10845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		queue que = new queue(); 
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if(input.equals("push")) {
				que.push(Integer.parseInt(st.nextToken()));
			}
			else if(input.equals("pop")) {
				bw.write(Integer.toString(que.pop())+"\n");
			}
			else if(input.equals("size")) {
				bw.write(Integer.toString(que.size())+"\n");
			}
			else if(input.equals("empty")) {
				bw.write(Integer.toString(que.empty())+"\n");
			}
			else if(input.equals("front")) {
				bw.write(Integer.toString(que.front())+"\n");
			}
			else if(input.equals("back")) {
				bw.write(Integer.toString(que.back())+"\n");
			}
			
		}
		bw.flush();
		bw.close();
	}
	static class queue{
		LinkedList<Integer> arr = new LinkedList<Integer>();
		int size = 0;
		int back = 0;
		void push(int n) {
			arr.add(n);
			back = n;
			size++;
		}
		int pop() {
			if(size < 1) {
				return -1;
			}
			int front = arr.get(0);
			arr.remove(0);
			size--;
			return front;
		}
		int size() {
			return size;
		}
		int empty() {
			if(size < 1) {
				return 1;
			}
			else {
				return 0;
			}
		}
		int front() {
			if(size < 1) {
				return -1;
			}
			return arr.get(0);
		}
		int back() {
			if(size<1) {
				return -1;
			}
			return back;
		}
	}
}
