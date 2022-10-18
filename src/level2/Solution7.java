package level2;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//다음 큰 숫자
	static int solution(int n) {
        int num = n+1;
        int count = 0;
        
        char[] c  = Integer.toString(n, 2).toCharArray();
        for(int i=0; i<c.length;i++) {
        	if(c[i] == '1') count++;
        }
        
        while(true) {
        	int count2 = 0;
        	char[] c2  = Integer.toString(num, 2).toCharArray();
            for(int i=0; i<c2.length;i++) {
            	if(c2[i] == '1') count2++;
            }
            if(count == count2) return num;
            num++;
        }
        
    }
}
