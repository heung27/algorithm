import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15649_N과_M_1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	
	static int[] list, numbers;
	static boolean[] check;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		list = new int[N+1];
		check = new boolean[N+1];
		numbers = new int[M];
		for (int i=1; i<=N; i++) {
			list[i] = i;
		}
		
		DFS(0);
		
		bw.write(sb.toString());
		bw.flush();
	}
	
	static void DFS(int cnt) {
		if (cnt == M) {
			for (int i=0; i<cnt; i++) {
				sb.append(numbers[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i=1; i<=N; i++) {
			if (check[i]) continue;
			
			numbers[cnt] = i;
			check[i] = true;
			DFS(cnt + 1);
			check[i] = false;
		}
	}
}
