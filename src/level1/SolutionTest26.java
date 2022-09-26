package level1;

import java.util.Arrays;
import java.util.Collections;

public class SolutionTest26 {

	public static void main(String[] args) {
		NumDesc nd = new NumDesc();
		
		System.out.println(nd.solution(118372));
		
		
	}

}


//정수 내림차순으로 배치하기
class NumDesc{
	public long solution(long n) {
		
		String[] str = String.valueOf(n).split("");
		
		
		//내림차순
		Arrays.sort(str, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length; i++) {
			sb.append(str[i]);
		}
		
		return Long.parseLong(String.valueOf(sb));
	}
	String res = "";
	public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }
}