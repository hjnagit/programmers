package level1;

import java.util.Arrays;

public class SolutionTest4 {

	public static void main(String[] args) {
		
		Solution4 sol = new Solution4();
		
		System.out.println(Arrays.toString(sol.solution(-4, 3)));
		
		
	}

}


class Solution4{
	public long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		answer[0] = x;
		
		for(int i=1; i<answer.length; i++) {
			answer[i] = answer[i-1] + x;
		}
		
		
		
		return answer;
	}
}