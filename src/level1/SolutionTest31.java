package level1;

public class SolutionTest31 {

	public static void main(String[] args) {

		NumSum31 ns = new NumSum31();

		// ns.solution(24, 27);
		System.out.println(ns.solution(24, 27));

	}

}

//����� ������ ����
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

	// �ڵ� �����غ���
	public int solution2(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			// �������� ��� ����� ������ Ȧ��
			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			}
			// �������� �ƴ� ��� ����� ������ ¦��
			else {
				answer += i;
			}
		}

		return answer;
	}
}