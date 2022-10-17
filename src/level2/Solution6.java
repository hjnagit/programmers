package level2;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//¿Ã¹Ù¸¥ °ýÈ£
	static boolean solution(String s) {
        boolean answer = true;
        
        char[] c = s.toCharArray();
        int result = 0;
        
        for(int i=0; i<c.length; i++) {
        	if(c[i] == '(') result += 1;
        	else result -= 1;
        	
        	if(result < 0) {
        		answer = false;
        		break;
        	}
        }
        
        if(result != 0) answer = false;
        
        return answer;
    }
}
