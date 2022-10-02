package level1;

import java.util.stream.IntStream;

public class SolutionTest29 {

	public static void main(String[] args) {
		
		Solu11 ab = new Solu11();
		
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
		
		System.out.println(ab.solution(a, b));
		
	}

}


//내적
class Solu11{
	public int solution(int[] a, int[] b) {
		
		int answer = 0;
		
		for(int i=0; i<a.length; i++) {
			answer += a[i] * b[i];
		}
		
        return answer;
    }
	
	//스트림 사용하기
	public int solution2(int[] a, int[] b) {
		return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
	}
}