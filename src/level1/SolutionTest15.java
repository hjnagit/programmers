package level1;


public class SolutionTest15 {
	public static void main(String[] args) {
		PyPy py = new PyPy();
		
		System.out.println(py.solution("pPoooyY"));
		System.out.println(py.solution("Pyy"));
		System.out.println(py.solution("slei"));
		
		
		
	}
}


//���ڿ� �� p�� y�� ����
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
		s = s.toLowerCase(); //�ҹ��ڷ� ��ȯ
		
		return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
	}
}