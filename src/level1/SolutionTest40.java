package level1;

public class SolutionTest40 {

	public static void main(String[] args) {

	}
	
	//최대공약수 최소공배수 
	static int[] solution2(int n, int m) {
		int[] answer = {1,1};
		
		//1. 두 수 중에 더 작은 수를 찾는다
		int min = (n > m) ? m : n;
		
		//2. 반복문을 돌려서 두 수의 약수 중 교집합을 찾는다 - 최대공약수
		for(int i=1; i<=min; i++) {
			if(n%i == 0 && m%i == 0) {
				answer[0] = i;
			}
		}
		
		//3. 최대공약수*최소공배수 = n*m
		answer[1] = n*m/answer[0];
		
		
		return answer;
	}

}
