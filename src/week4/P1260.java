package week4;

import java.io.*;
import java.util.*;

public class P1260 {
	// 변수 선언
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] checked;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static boolean DFS_flag;

	// Main
	public static void main(String[] args) throws IOException {
		// 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		checked = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph.get(start).add(end);
			graph.get(end).add(start);
		}

		// 작은 것부터 찾기
		for (int i = 1; i <= n; i++) {
			Collections.sort(graph.get(i));
		}

		// DFS
		checked[v] = true;
		DFS_flag = false;
		sb.append(v + " ");
		DFS(v);
		bw.write(sb.toString() + "\n");

		// BFS
		checked = new boolean[n + 1];
		sb = new StringBuilder();
		BFS(v);

		br.close();
		bw.close();
	}

	public static void DFS(int v) throws IOException {
		// 갈 수 있는 노드 찾기
		for (int next : graph.get(v)) {
			if (!checked[next]) {
				checked[next] = true;
				sb.append(next + " ");
				DFS(next);
			}
		}
	}

	public static void BFS(int v) throws IOException {
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.add(v);
		sb.append(v + " ");
		checked[v] = true;

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int cur = q.poll();
				for (int next : graph.get(cur)) {
					if (!checked[next]) {
						q.add(next);
						checked[next] = true;
						sb.append(next + " ");
					}
				}
			}
		}

		bw.write(sb.toString() + "\n");
	}
}
