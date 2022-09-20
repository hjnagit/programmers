package level1;

public class SolutionTest18 {

	public static void main(String[] args) {
		
		NumSum2 ns = new NumSum2();
		
		System.out.println(ns.sol(5, 3));
		
		
	}

}


//두 정수 사이의 합
class NumSum2{
	public long sol(int a, int b) {
		long answer = 0;
		
		if(a == b) {
			return a;
		} else if(a > b) {
			answer = b;
			while(a != b) {
				answer += ++b;
				if(a==b) return answer;
			}
		} else {
			answer = a;
			while(true) {
				answer += ++a;
				if(a==b) return answer;
			}
		}
		
		return answer;
	}
}