package level1;

public class SolutionTest23 {

	public static void main(String[] args) {

	}

}


//���� ���� ���ϱ�
class NothingNumSum{
	public int sol(int[] numbers) {
		
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		for(int i=0; i<10; i++) {
			sum -= i;
		}
		
		
		return -sum;
	}
}