package level1;

import java.util.Arrays;

public class SolutionTest36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//¿¹»ê
class Budget36{
	public int solution(int[] d, int budget) {
		
		Arrays.sort(d);
		
		int count = 0;
		
		for(int i=0; i<d.length; i++) {
			if(budget >= d[i]) {
				budget -= d[i];
				count++;
			} else {
				return count;
			}
		}
		
        return count;
    }
}