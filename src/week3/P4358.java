package week3;

import java.io.*;
import java.util.*;

public class P4358 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		Map<String, Integer> trees = new TreeMap<String, Integer>();
		
		String tree = "";
		
		while ((tree = br.readLine()) != null && !tree.isEmpty()){
			if (tree == "") {
				break;
			}
			if (!trees.isEmpty() && trees.containsKey(tree)) {
				trees.replace(tree, trees.get(tree) + 1);
			} else {
				trees.put(tree, 1);
			}
			count++;
		}
		
		for (String t : trees.keySet()) {
			bw.write(t  + " " + String.format("%.4f", ((float) Math.round(((float) trees.get(t) / count) * 100 * 10000) / 10000))  + "\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
	}
}
