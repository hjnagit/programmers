package level1;

public class SolutionTest6 {

	public static void main(String[] args) {
		Arr arr = new Arr();
		
		int[] a = {4,3,2,1,7};
		
		
		System.out.println(arr.solution(a));
		
		for(int i : arr.solution(a)) {
			System.out.println(i);
		}
	}

}


class Arr{
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		
		//값이 1개일 때 처리하기
		if(arr.length == 1) {
			int[] answer2 = {-1};
			return answer2;
		}
		
		//최소값 구하기
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		
		//최소값을 제외하고 값 넣기
		for(int i=0, j=0; i<arr.length; i++) {
			if(min == arr[i]) continue;
			else answer[j++] = arr[i];
		}
		
		// 스트림 사용!! 속도가 느림
//		if (arr.length <= 1) return new int[]{ -1 };
//	    int min = Arrays.stream(arr).min().getAsInt();
//	    return Arrays.stream(arr).filter(i -> i != min).toArray();
		
		
		return answer;
	}
}