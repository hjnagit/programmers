package level1;

import java.util.Arrays;

public class SolutionTest39 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int[] solution(int[] array, int[][] commands) {

		int a, b, c;

		int[] answer = new int[commands.length];
		// System.out.println(commands.length);

		for (int i = 0; i < commands.length; i++) {
			a = commands[i][0];
			b = commands[i][1];
			c = commands[i][2];

			int[] arr = Arrays.copyOfRange(array, a - 1, b);
			Arrays.sort(arr);

			// for(int aa : arr) {
			// System.out.print(aa);
			// }
			// System.out.println();

			answer[i] = arr[c - 1];
		}

		return answer;
	}
}
