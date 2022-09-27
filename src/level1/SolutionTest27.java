package level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest27 {

	public static void main(String[] args) {
		DivNum dn = new DivNum();
		
		int[] arr = {1,5,3,8,10};
		
		System.out.println(Arrays.toString(dn.solution(arr, 5)));
		
		
	}

}


//나누어 떨어지는 숫자 배열
class DivNum{
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.size() == 0) {
			list.add(-1);
		}
		
		Collections.sort(list);
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		
        return answer;
    } 
}
