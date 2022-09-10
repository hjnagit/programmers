package level1;

public class SolutionTest11 {
	public static void main(String[] args) {
		
		System.out.println(Math.round(Math.sqrt(3)));
		
	}
}


//정수 제곱근 판별
class Check1{
	public long sol(int n) {
		long answer = 0;
		
		long num = Math.round(Math.sqrt(n));
		
		if(num*num == n ) {
			answer = (num+1)*(num+1);
		}else {
			answer = -1;
		}
	
        return answer;
	}
}