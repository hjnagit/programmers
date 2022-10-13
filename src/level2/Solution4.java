package level2;

public class Solution4 { 

	public static void main(String[] args) {
		solution("01101");  
	}
	
	//이진 변환 반복하기
	static int[] solution(String s) {
        int[] answer = {};
        int a = 0;
        int b = 0;
        
        int num = 0;
        String str = "";
        while(true) {
        	int i = 0;
        	
        	if(s.charAt(i) == '0') a++;
        	
        	if(i == s.length()-1) {
        		str = s.length() - a + "";
        		s = Integer.parseInt(str, 2) + "";
        	}
        	
        	if(s == "1") break;
        	i++;
        }
        
        System.out.println(str);
        
        
        
        return answer;
    }
}
