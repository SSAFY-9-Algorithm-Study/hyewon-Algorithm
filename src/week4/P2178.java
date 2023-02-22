package week4;

import java.io.*;
import java.util.*;

public class P2178 {
	static int[][] map;
	static int[][] dist;

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		dist = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			char[] nums = br.readLine().toCharArray();
			for (int j = 0; j < m; j++) {
				map[i][j] = nums[j] - '0';
			}
		}

		dist[0][0] = 1;
		BFS(new Point(0, 0));

		bw.write(dist[n - 1][m - 1] + "\n");
		bw.flush();

		br.close();
		bw.close();
	}

	public static void BFS(Point p) {
		Deque<Point> Q = new ArrayDeque<Point>();
		Q.addFirst(p);

		int level = 2;

		while (!Q.isEmpty()) {
			int size = Q.size();

			for (int t = 0; t < size; t++) {
				Point cur = Q.pollFirst();
				for (int i = 0; i < 4; i++) {
					Point next = new Point(cur.x + dx[i], cur.y + dy[i]);
					if (check(next.x, next.y)) {
						Q.add(next);
						dist[next.x][next.y] = level;
					}
				}
			}
			level++;
		}
	}

	public static boolean check(int x, int y) {
		// 맵을 벗어나는지 확인
		if (x < 0 || x >= map.length) {
			return false;
		}
		if (y < 0 || y >= map[0].length) {
			return false;
		}

		// 이동가능한지 확인
		if (map[x][y] == 1 && dist[x][y] == 0) {
			return true;
		} else {
			return false;
		}
	}
}
