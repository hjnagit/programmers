package level1;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionTest30 {

	public static void main(String[] args) {
		StringDesc sd = new StringDesc();

		sd.solution("abDfeA");

	}

}

//���ڿ� �������� ��ġ
class StringDesc {
	public String solution(String s) {
		String answer = "";

		String[] str = s.split("");

		// ��������
		Arrays.sort(str, Comparator.reverseOrder());

//		answer = Arrays.toString(str);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}

		answer = sb.toString();

		return answer;
	}

	public String reverseStr(String str) {
		char[] sol = str.toCharArray(); // String�� char[]�� ��ȯ
		Arrays.sort(sol); //�迭 �����ϱ� - ��������
		return new StringBuilder(new String(sol)).reverse().toString(); //��������->String���� ��ȯ
		
	}
	
	public String solution2(String s) {
		String answer = "";

		String[] str = s.split("");

		// ��������
		Arrays.sort(str, Comparator.reverseOrder());


		StringBuilder sb = new StringBuilder(); 
		// �� �ȴ� new String�� String[] �ִ°� ��������
		//char[], byte[], int[] ����

		answer = sb.toString();

		return answer;
	}
}