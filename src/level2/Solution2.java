package level2;

public class Solution2 {

	public static void main(String[] args) {
		solution("3people unFollowed me");
	}
	
	//JadenCase 문자열 만들기
	static String solution(String s) {
        String answer = "";
        
        char[] c = s.toLowerCase().toCharArray();
        // = s.toCharArray();
        
//        if(c[0]>= '1' && c[0] <= 9) {
//        	answer += c[0];
//        }else {
        answer += (c[0]+ "").toUpperCase();
//        }
        
        for(int i=1;i<c.length;i++) {
        	if(c[i-1] == ' ') {
        		answer += (c[i]+ "").toUpperCase();
        	}else {
        		answer += c[i];
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
