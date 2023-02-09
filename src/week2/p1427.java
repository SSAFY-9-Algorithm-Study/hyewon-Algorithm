package week2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class p1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		char[] nums = num.toCharArray();
		Arrays.sort(nums);
		
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i]);
		}
		
		br.close();
	}
}
