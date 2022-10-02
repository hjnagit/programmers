package level1;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionTest30 {

	public static void main(String[] args) {
		StringDesc sd = new StringDesc();

		sd.solution("abDfeA");

	}

}

//문자열 내림차순 배치
class StringDesc {
	public String solution(String s) {
		String answer = "";

		String[] str = s.split("");

		// 내림차순
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
		char[] sol = str.toCharArray(); // String을 char[]로 변환
		Arrays.sort(sol); //배열 정렬하기 - 오름차순
		return new StringBuilder(new String(sol)).reverse().toString(); //내림차순->String으로 변환
		
	}
	
	public String solution2(String s) {
		String answer = "";

		String[] str = s.split("");

		// 내림차순
		Arrays.sort(str, Comparator.reverseOrder());


		StringBuilder sb = new StringBuilder(); 
		// 안 된다 new String에 String[] 넣는거 오류난다
		//char[], byte[], int[] 가능

		answer = sb.toString();

		return answer;
	}
}