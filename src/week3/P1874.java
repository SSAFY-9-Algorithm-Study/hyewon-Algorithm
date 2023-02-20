package week3;

import java.io.*;
import java.util.*;

public class P1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<Integer> nums = new ArrayDeque<Integer>();
		Deque<Integer> target = new ArrayDeque<Integer>();
		Deque<String> result = new ArrayDeque<String>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			nums.addLast(i);
		}

		boolean isImpossible = false;

		for (int i = 0; i < n; i++) {
			int target_num = Integer.parseInt(br.readLine());

			// push해야하는지, pop 해야하는지 확인
			if (!nums.isEmpty() && target_num >= nums.peekFirst()) { // push 해야 하는 경우
				// target_num 전까지 push
				while (target_num != nums.peekFirst()) {
					target.addLast(nums.pollFirst());
					result.add("+");
				}

				// target_num 제거
				nums.pollFirst();
				result.add("+");
				result.add("-");
			} else {												// pop 해야 하는 경우
				// pop 할 원소가 없는 경우
				if (target.isEmpty()) {
					isImpossible = true;
					break;
				} else {
					// pop 하는 원소가 원하는 숫자가 아닌 경우
					if (target.pollLast() == target_num) {
						result.add("-");
					} else {
						isImpossible = true;
						break;
					}
				}
			}
		}

		// 불가능한 경우
		if (isImpossible) {
			bw.write("NO");
			bw.flush();
		} else {
			while (!result.isEmpty()) {
				bw.write(result.pollFirst() + "\n");
				bw.flush();
			}
		}

		br.close();
		bw.close();
	}
}
