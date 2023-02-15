package week3;

import java.io.*;
import java.util.*;

public class p11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Deque<Integer> nums = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			nums.add(i);
		}
		
		bw.write("<");
		while(nums.size() != 1) {
			for (int i = 0; i < k - 1; i++) {
				int temp = nums.poll();
				nums.add(temp);
			}
			bw.write(nums.poll() + ", ");
		}
		bw.write(nums.poll() + ">");
		bw.flush();
		
		br.close();
		bw.close();
	}
}
