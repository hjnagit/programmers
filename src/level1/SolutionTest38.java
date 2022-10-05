package level1;

public class SolutionTest38 {

	public static void main(String[] args) {

		Min38 m = new Min38();

		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

		System.out.println(m.solution(sizes));

	}

}

//최소직사각형
class Min38 {
	public int solution(int[][] sizes) {
		int a = 0;
		int b = 0;

		int max1 = 0;
		int max2 = 0;
		System.out.println(sizes.length);
		for (int i = 0; i < sizes.length; i++) {
			max1 = sizes[i][0] >= sizes[i][1] ? sizes[i][0] : sizes[i][1];
			max2 = max1 == sizes[i][0] ? sizes[i][1] : sizes[i][0];
			if (max1 > a)
				a = max1;
			if (max2 > b)
				b = max2;
		}
		return a * b;
	}

	
	// for-each문과 Math.max min
	public int solution2(int[][] sizes) {
		int length = 0, height = 0;
		for (int[] card : sizes) {
			length = Math.max(length, Math.max(card[0], card[1]));
			height = Math.max(height, Math.min(card[0], card[1]));
		}
		int answer = length * height;
		return answer;
	}
}