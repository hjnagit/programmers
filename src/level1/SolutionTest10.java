package level1;

public class SolutionTest10 {

	public static void main(String[] args) {
		
		Solution10 s = new Solution10();
		
		System.out.println(s.sol(5));
		
		
	}

}

//약수의 합
class Solution10{
	public int sol(int n) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) answer += i;
		}
		
		return answer;
	}
}