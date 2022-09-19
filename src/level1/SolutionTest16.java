package level1;

public class SolutionTest16 {
	public static void main(String[] args) {
		StrNum sn = new StrNum();
		
		
		System.out.println(sn.solution("-1234"));
		
		
	}
	
	
	
}


//문자열을 정수로 바꾸기
class StrNum{
	public int solution(String s) {
		
		return Integer.parseInt(s);
	}
}