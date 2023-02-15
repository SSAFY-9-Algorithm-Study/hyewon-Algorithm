package week3;

import java.io.*;
import java.util.*;

public class p12605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			bw.write("Case #" + i + ": ");
			
			Deque<String> strs = new LinkedList<String>(Arrays.asList(br.readLine().split(" ")));
			
			while (!strs.isEmpty()) {
				bw.write(strs.pollLast() + " ");
			}
			
			bw.write("\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
	}
}
