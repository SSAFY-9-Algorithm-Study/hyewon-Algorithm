package basic;

import java.io.*;

public class p11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");

		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		String[] s_nums = br.readLine().split(" ");

		int[] sums = new int[n + 1];
		sums[0] = 0;

		for (int i = 1; i <= n; i++) {
			sums[i] = sums[i - 1] + Integer.parseInt(s_nums[i-1]);
		}

		for (int test_case = 0; test_case < m; test_case++) {
			String[] ij = br.readLine().split(" ");
			System.out.println(sums[Integer.parseInt(ij[1])] - sums[Integer.parseInt(ij[0]) - 1]);
		}

		br.close();
	}
}
