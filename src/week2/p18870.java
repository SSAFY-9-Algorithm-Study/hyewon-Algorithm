package week2;

import java.io.*;
import java.util.*;

public class p18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Writer wr = new OutputStreamWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		Set<Integer> nums = new HashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(nums);
		
		br.close();
		wr.close();
	}
}
