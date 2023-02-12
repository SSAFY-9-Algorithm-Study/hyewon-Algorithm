package week2;

import java.io.*;
import java.util.Arrays;

public class p11650_v2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		Point[] p = new Point[n];
		
		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			
			Point p_temp = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
			
			p[i] = p_temp;
		}
		
		Arrays.sort(p);
		
		for (int i = 0; i < n; i++) {
			System.out.println(p[i].x + " " + p[i].y);
		}
		
		br.close();
	}
}

class Point implements Comparable<Point> {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if (x != o.x) {
			return x - o.x;
		} else {
			return y - o.y;
		}
	}
}