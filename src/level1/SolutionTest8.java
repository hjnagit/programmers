package level1;

public class SolutionTest8 {

	public static void main(String[] args) {
		
		
		System.out.println(-5%2);
		
		
	}

}

class OddEven{
	public String sol(int num) {
		String answer = null;
		
		if(num%2 == 1 || num%2 == -1 || num == 0) answer = "Even";
		else answer = "Odd";
		
		
		return answer;
	}
}