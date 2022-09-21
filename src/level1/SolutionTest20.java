package level1;

public class SolutionTest20 {

	public static void main(String[] args) {
		As as = new As();
		
		int[] a = {4,7,12};
		boolean[] b = {true, false, true};
		
		System.out.println(as.sol(a, b));
		
		
	}

}


//음양 더하기
class As{
	public int sol(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i=0; i<absolutes.length; i++) {
//			if(signs[i]) {
//				answer += a[i];
//			} else {
//				answer -= a[i];
//			}
			answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
			//answer += absolutes[i] * (signs[i]? 1: -1);
		}
		
        return answer;
	}
}