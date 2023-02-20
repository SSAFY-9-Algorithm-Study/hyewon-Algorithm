package week3;

import java.io.*;
import java.util.*;

public class P2161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> nums = new ArrayDeque<Integer>();
		
		for (int i = 1; i <= n; i++) {
			nums.addLast(i);
		}
		
		while (nums.size() != 1) {
			bw.write(nums.pollFirst() + " ");
			bw.flush();
			
			nums.addLast(nums.pollFirst());
		}
		
		bw.write(nums.pollFirst() + "\n");
		bw.flush();
		
		br.close();
		bw.close();
	}
}
