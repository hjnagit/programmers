package level1;

public class SolutionTest31 {

	public static void main(String[] args) {

		NumSum31 ns = new NumSum31();

		// ns.solution(24, 27);
		System.out.println(ns.solution(24, 27));

	}

}

//약수의 개수와 덧셈
class NumSum31 {
	public int solution(int left, int right) {

		int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			// System.out.println(count);
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}

		return answer;
	}

	// 코드 정리해보자
	public int solution2(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			// 제곱수인 경우 약수의 개수가 홀수
			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			}
			// 제곱수가 아닌 경우 약수의 개수가 짝수
			else {
				answer += i;
			}
		}

		return answer;
	}
}