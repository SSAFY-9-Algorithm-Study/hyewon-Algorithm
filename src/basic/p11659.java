package basic;

import java.io.*;

public class p11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = br.readLine().split(" ");
		
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		int[] nums = new int[n];
		String[] s_nums = br.readLine().split(" ");
		
		for (int test_case = 0; test_case < m; test_case++) {
			String[] ij = br.readLine().split(" ");
			int sum = 0;
			
			for (int i = Integer.parseInt(ij[0]); i <= Integer.parseInt(ij[1]); i++) {
				sum += Integer.parseInt(s_nums[i - 1]);
			}
			
			System.out.println(sum);
		}
		
		br.close();
	}
}
