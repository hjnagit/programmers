package level2;

import java.util.Arrays;
import java.util.Comparator;

public class Solution3 {

	public static void main(String[] args) {
		
	}
	
	//최솟값 만들기
	//풀이 1 -> 효율성 실패
	public int solution(int []A, int []B) {
        int answer = 0;
        
        Arrays.sort(A);
        
        //Integer로 바꾸고 내림차순으로 정렬
        Integer[] b = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(b, Comparator.reverseOrder());
        
        for(int i=0; i<b.length; i++) {
        	answer += A[i] * b[i];
        }
        
        return answer;
    }
	
	public int solution2(int []A, int []B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<B.length; i++) {
        	answer += A[i] * B[B.length-1-i];
        }
        
        return answer;
    }
}
