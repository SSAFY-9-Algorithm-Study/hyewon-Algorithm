package week3;

import java.io.*;
import java.util.*;

public class p1822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<Integer> setA = new TreeSet<Integer>();
		Set<Integer> setB = new TreeSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < n; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		setA.removeAll(setB);
		
		bw.write(setA.size() + "\n");
		bw.flush();
		for (Integer num : setA) {
			bw.write(num + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
