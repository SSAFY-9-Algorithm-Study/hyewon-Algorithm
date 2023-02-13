package week2;

import java.io.*;
import java.util.*;

public class p18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Writer wr = new OutputStreamWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sorted_nums = new int[n];
		System.arraycopy(nums, 0, sorted_nums, 0, n);
		Arrays.sort(sorted_nums);
		
		Map<Integer, Integer> rank_nums = new HashMap<Integer, Integer>();
		int rank = 0;
		
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				rank_nums.put(sorted_nums[i], rank++);
			} else {
				if (sorted_nums[i] != sorted_nums[i-1]) {
					rank_nums.put(sorted_nums[i], rank++);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			wr.write(rank_nums.get(nums[i]) + "\n");
		}
		
		br.close();
		wr.close();
	}
}
