package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest13 {

	public static void main(String[] args) {
		
		ArrMake arr = new ArrMake();
		
		System.out.println(Arrays.toString(arr.sol(12345)));
		
	}

}


//�ڿ��� ������ �迭�� �����
class ArrMake{
	public int[] sol(long n) {
		
		String[] s = String.valueOf(n).split("");
		List<String> list = Arrays.asList(s);
		Collections.reverse(list);
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
		
        return answer;
	}
	
	public int[] sol2(long n) {
		//�ڿ����� ���̷� �迭 ũ�� �������ִ� ��!!!
		String a = "" + n;
		int[] answer = new int[a.length()];
		int cnt=0;

		while(n>0) {
			answer[cnt]=(int)(n%10);
			n/=10;
			System.out.println(n);
			cnt++;
		}
		
        return answer;
	}
}