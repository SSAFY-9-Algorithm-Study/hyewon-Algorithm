package basic;

import java.io.*;
import java.util.*;

public class p10996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s1 = "";
		String s2 = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				s1 += "*";
				s2 += " ";
			} else {
				s1 += " ";
				s2 += "*";
			}
		}

		if (n == 1) {
			System.out.println(s1);
		} else {
			for (int i = 0; i < n; i++) {
				System.out.println(s1);
				System.out.println(s2);
			}
		}
	}

}
