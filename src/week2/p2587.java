package week2;

import java.io.*;
import java.util.Arrays;

public class p2587 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int[] nums = new int[5];
		
		for (int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		
		Arrays.sort(nums);
		
		System.out.println(sum / 5);
		System.out.println(nums[2]);
		
		br.close();
	}
}
