import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class baekjoon_1927 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		// heap의 1번 자리를 root로 사용하기 위해 heap[0]를 0으로 선언하고 size를 1로 선언
		int[] heap = new int[t + 1];
		heap[0] = 0;
		int size = 1;
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n != 0) {
				add(heap, size, n);
			} else {
				bw.write(String.valueOf(remove(heap, size))+"\n");
			}
		}
	}

	static void add(int[] heap, int size, int n) {
		heap[size] = n;
		for (int i = size; i <= 1; i /= 2) {
			if(heap[i] > heap[i/2]) {
				int temp = heap[i];
				heap[i] = heap[i/2];
				heap[i/2] = temp;
			}else if(heap[i] > heap[i/2+1]) {
				int temp = heap[i];
				heap[i] = heap[i/2+1];
				heap[i/2+1] = heap[i];
			}else {
				break;
			}
		}
		size++;
	}

	static int remove(int[] heap, int size) {
		int min = heap[1];
		heap[1] = heap[size-1];
		size--;
		for(int i = 1; i < size ; i *=2) {
			
		}
		return min;
	}
}
