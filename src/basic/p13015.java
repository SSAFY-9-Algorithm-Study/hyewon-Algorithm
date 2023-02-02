package basic;

import java.io.*;

public class p13015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] strs = new String[n];

		// First Line (End Line)
		strs[0] = repeat("*", n) + repeat(" ", 2 * (n - 1) - 1) + repeat("*", n);

		for (int i = 1; i < n - 1; i++) {
			strs[i] = repeat(" ", i) + "*" + repeat(" ", n - 2) + "*" + repeat(" ", 2 * (n - i - 1) - 1) + "*"
					+ repeat(" ", n - 2) + "*";
		}

		strs[n - 1] = repeat(" ", n - 1) + "*" + repeat(" ", n - 2) + "*" + repeat(" ", n - 2) + "*";

		// print
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n) {
				System.out.println(strs[i]);
			} else {
				System.out.println(strs[2*n - i - 2]);
			}
		}
	}

	public static String repeat(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}
}