package week3;

import java.io.*;
import java.util.*;

public class P11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		Set<String> results = new HashSet<String>();
		
		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0; j < str.length() - i + 1; j++) {
				results.add(str.substring(j, j+i));
			}
		}
		
		bw.write(results.size() + "\n");
		bw.flush();
		
		br.close();
		bw.close();
	}
}
