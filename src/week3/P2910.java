package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P2910 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<Integer, Integer> nums = new LinkedHashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (!nums.isEmpty() && nums.containsKey(temp)) {
				nums.replace(temp, nums.get(temp) + 1);
			} else {
				nums.put(temp, 1);
			}
		}
		 
		List<Entry<Integer, Integer>> sorted_nums = nums.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toList());
		
		for (int i = 0; i < sorted_nums.size(); i++) {
			for (int j = 0; j < sorted_nums.get(i).getValue(); j++) {
				bw.write(sorted_nums.get(i).getKey() + " ");
			}
		}

		br.close();
		bw.close();
	}
}
