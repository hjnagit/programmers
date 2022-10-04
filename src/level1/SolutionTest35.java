package level1;

import java.util.Arrays;

public class SolutionTest35 {

	public static void main(String[] args) {
		ArrNum35 an = new ArrNum35();
		
		int[] arr = {4,4,4,3,3};
		an.solution(arr);
		
		System.out.println("--------------------------------");
		for(int arrr : an.solution(arr)) {
			System.out.println(arrr);
		}
	}

}


//같은 숫자는 싫어
class ArrNum35{
	public int[] solution(int []arr) {
        int[] answer = arr;
        
        int count = 0;
        int j = 1;
        
        for(int i=1; i<arr.length; i++) {
        	if(arr[i-1] != arr[i]) {
        		answer[j] = arr[i];
        		//System.out.println(answer[j]);
        		count++;
        		j++;
        	}
        	//System.out.println("..." + answer[i]);
        }
        
        int[] answer2 = Arrays.copyOfRange(answer, 0, count+1);
        
        return answer2;
    }
}