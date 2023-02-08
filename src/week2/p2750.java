package week2;

import java.io.*;
import java.util.*;

public class p2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];

		// Input
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			nums[i] = temp;
		}

		Arrays.sort(nums);

		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
		br.close();
	}
}
