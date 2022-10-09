package level2;

import java.util.Arrays;
import java.util.Comparator;

public class Solution3 {

	public static void main(String[] args) {
		
	}
	
	//�ּڰ� �����
	//Ǯ�� 1 -> ȿ���� ����
	public int solution(int []A, int []B) {
        int answer = 0;
        
        Arrays.sort(A);
        
        //Integer�� �ٲٰ� ������������ ����
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
