package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, Boolean> map = new TreeMap<String, Boolean>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), false);
		}

		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (map.containsKey(name)) {
				map.replace(name, true);
				count++;
			}
		}

		bw.write(count + "\n");
		bw.flush();
		
		for (Entry<String, Boolean> entry : map.entrySet()) {
			if (entry.getValue()) {
				bw.write(entry.getKey() + "\n");
				bw.flush();
			}
		}

		br.close();
		bw.close();
	}
}
