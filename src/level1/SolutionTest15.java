package level1;


public class SolutionTest15 {
	public static void main(String[] args) {
		PyPy py = new PyPy();
		
		System.out.println(py.solution("pPoooyY"));
		System.out.println(py.solution("Pyy"));
		System.out.println(py.solution("slei"));
		
		
		
	}
}


//문자열 내 p와 y의 개수
class PyPy{
	boolean solution(String s) {
		boolean answer = true;
		
		String[] str = s.split("");

		
		int numP = 0;
		int numY = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("P") || str[i].equals("p")) {
				numP++;
			}
			else if(str[i].equals("Y") || str[i].equals("y")){
				numY++;
			}
		}
		
		if(numP != numY) {
			answer = false;
		}
		
        return answer;
	}
	
	boolean sol2(String s) {
		s = s.toLowerCase(); //소문자로 변환
		
		return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
	}
}