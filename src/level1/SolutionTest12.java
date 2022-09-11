package level1;

public class SolutionTest12 {

	public static void main(String[] args) {
		
		ArrAvg a = new ArrAvg();
		
		int[] i = {1,2,3,4};
		
		System.out.println(a.sol(i));
		
		
	}

}


//Æò±Õ±¸ÇÏ±â
class ArrAvg{
	public double sol(int[] arr) {
		double answer = 0;
		
		int sum = 0;
		
		for(int i : arr) sum += i;
		
		answer = sum/(arr.length * 1.0);
		
		//return (int) Arrays.stream(i).average().orElse(0);
		
        return answer;
	}
}