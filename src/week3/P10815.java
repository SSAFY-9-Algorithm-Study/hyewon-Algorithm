package week3;

import java.io.*;
import java.util.*;

public class P10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<Integer, Boolean> cards = new HashMap<Integer, Boolean>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) {
			cards.put(Integer.parseInt(st.nextToken()), true);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			if (cards.containsKey(Integer.parseInt(st.nextToken()))) {
				bw.write("1 ");
			} else {
				bw.write("0 ");
			}
		}
		
		br.close();
		bw.close();
	}
}
