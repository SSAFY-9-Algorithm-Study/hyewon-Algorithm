package week2;

import java.io.*;
import java.util.Arrays;

public class p2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int MIN_VALUE = -5000;
		
		int sum = 0;
		int[] nums = new int[n];
		int[] cnt_nums = new int[8001];
		int max = MIN_VALUE;
		int max_2 = MIN_VALUE;
		int max_count = -1;
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
			cnt_nums[nums[i] + 4000] += 1;
		}
		
		Arrays.sort(nums);
		
		for (int i = cnt_nums.length- 1; i >= 0; i--) {
			if (max_count < cnt_nums[i]) {
				max_count = cnt_nums[i];
				max = i;
				max_2 = MIN_VALUE;
			} else if (max_count == cnt_nums[i]) {
				max_2 = max;
				max = i;
			}
		}
		
		System.out.println(Math.round((double) sum / n));
		System.out.println(nums[n/2]);
		if (max_2 != MIN_VALUE) {
			System.out.println(max_2 - 4000);
		} else {
			System.out.println(max - 4000);
		}
		
		System.out.println(nums[n-1] - nums[0]);
		br.close();
	}
}
