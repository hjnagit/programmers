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
		
		//���� 1���� �� ó���ϱ�
		if(arr.length == 1) {
			int[] answer2 = {-1};
			return answer2;
		}
		
		//�ּҰ� ���ϱ�
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		
		//�ּҰ��� �����ϰ� �� �ֱ�
		for(int i=0, j=0; i<arr.length; i++) {
			if(min == arr[i]) continue;
			else answer[j++] = arr[i];
		}
		
		// ��Ʈ�� ���!! �ӵ��� ����
//		if (arr.length <= 1) return new int[]{ -1 };
//	    int min = Arrays.stream(arr).min().getAsInt();
//	    return Arrays.stream(arr).filter(i -> i != min).toArray();
		
		
		return answer;
	}
}