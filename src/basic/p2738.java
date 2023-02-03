package basic;

import java.io.*;
import java.util.*;

public class p2738 {
	public static void main(String[] args) throws IOException {
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp = br.readLine();
		String[] sizes = temp.split(" ");

		int n = Integer.parseInt(sizes[0]);
		int m = Integer.parseInt(sizes[1]);

		int[][] result = new int[n][m];

		// Matrix A Input
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String[] nums = input.split(" ");
			for (int j = 0; j < m; j++) {
				result[i][j] = Integer.parseInt(nums[j]);
			}
		}

		// Matrix B Input
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String[] nums = input.split(" ");
			for (int j = 0; j < m; j++) {
				result[i][j] += Integer.parseInt(nums[j]);
			}
		}
		
		// Output
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
		

		br.close();
	}
}
