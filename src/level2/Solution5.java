package level2;

public class Solution5 {

	public static void main(String[] args) {

	}
	//숫자의 표현
	public int solution(int n) {
        int answer = 0;
        
        
        for(int i=1; i<=n; i++) {
        	int result = 0;
        	for(int j=i; j<=n; j++) {
        		result += j;
        		if(result == n) {
        			answer++;
        			break;
        		}
        		if(result > n) break;
        	}
        }
        
        return answer;
    }
}
