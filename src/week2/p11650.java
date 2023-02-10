package week2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class p11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Integer[][] nums = new Integer[n][2];

		for (int i = 0; i < n; i++) {
			String[] s_nums = br.readLine().split(" ");
			nums[i][0] = Integer.parseInt(s_nums[0]);
			nums[i][1] = Integer.parseInt(s_nums[1]);
		}

		if (n != 1) {

			Arrays.sort(nums, new Comparator<Integer[]>() {
				public int compare(Integer[] a, Integer[] b) {
					if ((int) a[0] != (int) b[0]) {
						return (int) a[0] - (int) b[0];
					} else {
						return (int) a[1] - (int) b[1];
					}
				}
			});
		}

		for (int i = 0; i < n; i++) {
			System.out.println(nums[i][0] + " " + nums[i][1]);
		}

		br.close();
	}
}
