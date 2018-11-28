package baekjoon;
import java.io.*;
import java.util.*;

public class baekjoon_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		for(int i = 0 ; i <  T ; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			if(cmd.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			else if(cmd.equals("pop")) {
				bw.write(String.valueOf(stack.pop())+"\n");
			}
			else if(cmd.equals("size")) {
				bw.write(String.valueOf(stack.size())+"\n");
			}
			else if(cmd.equals("empty")) {
				bw.write(String.valueOf(stack.empty())+"\n");
			}
			else if(cmd.equals("top")) {
				bw.write(String.valueOf(stack.top())+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static class Stack{
		private int size = 0;
		private int[] arr = new int[10000];
		public void push(int n) {
			arr[size] = n;
			size++;
		}
		public int pop() {
			if(size==0) {
				return -1;
			}
			int n = arr[size-1];
			size--;
			return n;
		}
		public int size() {
			return size;
		}
		public int empty() {
			if(size == 0) {
				return 1;
			}else {
				return 0;
			}
		}
		public int top() {
			if(size == 0) {
				return -1;
			}
			return arr[size-1];
		}
	}
}
