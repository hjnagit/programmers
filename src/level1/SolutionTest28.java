package level1;


public class SolutionTest28 {

	public static void main(String[] args) {
		
		CenterStr cs = new CenterStr();
		
		System.out.println(cs.solution("asdf"));
		
	}

}

//가운데 글자 가져오기
class CenterStr {
	public String solution(String s) {
		String answer = "";
		//s.substring(0, 0); 이거 함수 있었는데 까먹음
		
		char[] c = s.toCharArray();
		
		if(s.length()%2 != 0) {
			answer = String.valueOf(c, s.length()/2, 1);
		} else {
			answer = String.valueOf(c, s.length()/2-1, 2);
		}
		
		return answer;
	}
}