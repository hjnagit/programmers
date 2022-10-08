package level1;

public class Solution41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//소수 찾기
	static int solution(int n) {
		int answer = 0;
		
		for(int i=2; i<=n; i++) {
			boolean is = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					is = false;
					break;
				}
			}
			if(is) answer++;
		}
		
        return answer;
    }
	
	static int solution2(int n) {
		int answer = 0;
		
		for(int i=2; i<=n; i++) {
			boolean is = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					is = false;
					break;
				}
			}
			if(is) answer++;
		}
		
        return answer;
    }
}
