package level2;

public class Solution1 {

	public static void main(String[] args) {
		
		solution("-1 -2 -3 -4");
		
		
		
	}
	//ÃÖ´ñ°ª°ú ÃÖ¼Ú°ª
	static String solution(String s) {
		
		String[] c = s.split(" ");
		
		int max = Integer.parseInt(c[0]);
		int min = Integer.parseInt(c[0]);
		
		for(int i=1; i<c.length; i++) {
			max = Math.max(max, Integer.parseInt(c[i]));
			min = Math.min(min, Integer.parseInt(c[i]));
			//System.out.println(max);
			//System.out.println(min);
		}
		
		
        return min + " " + max;
    } 
}
