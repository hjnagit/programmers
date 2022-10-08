package level1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//두 개 뽑아서 더하기
	public int[] solution(int[] numbers) {
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				if(i != j)	set.add(numbers[i]+numbers[j]);
			}
		}
		
		Iterator<Integer> ir = set.iterator();
		int[] answer = new int[set.size()];
		
		int i = 0;
		while(ir.hasNext()) {
			answer[i] = ir.next();
			i++;
		}
		
		
		
        return answer;
    }
	
}
