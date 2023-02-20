package week3;

import java.io.*;
import java.util.*;

public class P1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<Integer> A = new HashSet<Integer>();
		Set<Integer> B = new HashSet<Integer>();

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		Set<Integer> temp = new HashSet<Integer>(A);
		
		A.removeAll(B);
		B.removeAll(temp);
		
		A.addAll(B);
		
		bw.write(A.size() + "\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
