package level1;


public class SolutionTest32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum32 s = new Sum32();
		
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		
		s.solution(arr1, arr2);
		
	}

}


//Çà·ÄÀÇ µ¡¼À - Çª´Â ÁßÀÔ´Ï´ç - ÀÌ~°Ô~¹¹¾ß~?
class Sum32{
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1[0].length][arr1[1].length];
        System.out.println(arr1[0].length + ", " + arr1[1].length);
        System.out.println(answer[0].length + ", " + answer[1].length);
        System.out.println("answer.length : " + arr1.length);
        
        for(int i=0; i<answer.length; i++) {
        	for(int j=0; j<answer[i].length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        		System.out.println(answer[i][j]);
        	}
        }
        
        return answer;
    }
}