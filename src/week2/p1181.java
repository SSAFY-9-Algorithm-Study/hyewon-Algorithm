package week2;

import java.io.*;
import java.util.*;

public class p1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Writer wr = new OutputStreamWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		
		Set<String> strs = new HashSet<String>();
		
		for (int i = 0; i < n; i++) {
			strs.add(br.readLine());
		}
		
		ArrayList<String> str_set = new ArrayList<String>(strs);
		
		Collections.sort(str_set, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		
		for (String s : str_set) {
			wr.write(s + "\n");
		}
		
		br.close();
		wr.close();
	}
}
