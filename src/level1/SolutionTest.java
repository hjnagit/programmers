package level1;

public class SolutionTest {

	public static void main(String[] args) {
		
		String s = "   A   a    AaAaAaAaA     aAaAaAa     ";
		String s1 = "";
		s1 += s.charAt(0);
		s1 += s.charAt(1);
		s1 += s.charAt(2);
		
		System.out.println(s1);
		
		
		Solution sol = new Solution();
		
		String answer = sol.solution(s);
		System.out.println(answer);
		
	}

}


class Solution{
	public String solution(String s) {
		String answer = "";
		
		s = s.toLowerCase();
		
		String[] str = s.split(" ", -1);
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length(); j++) {
				if(j%2 == 0) {
					answer += Character.toUpperCase(str[i].charAt(j));
				}else {
					answer += str[i].charAt(j);
				}
			}
			answer += " ";
		}
		
		return answer.substring(0, answer.length()-1);
	}
}