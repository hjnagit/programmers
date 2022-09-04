package level1;

public class SolutionTest2 {

	public static void main(String[] args) {
		// 나머지가 1이되는 수 찾기
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(10));
		
	}

}

class Solution2{
	public int solution(int n) {
		int answer=0;
		
		for(int i=2; i<1000000; i++) {
			if(n%i == 1) {
				answer = i;
				break;
			}
		}
		
		
		return answer;
	}
}