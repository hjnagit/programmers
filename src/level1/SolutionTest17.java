package level1;

public class SolutionTest17 {

	public static void main(String[] args) {
		Collatz col = new Collatz();
		
		System.out.println(col.col(626331));
		
	}

}


//�ݶ��� ����
class Collatz{
	public int col(int num) {
		int answer = 0;
		
		long num2 = num;
		
		if(num2 ==1) {
			return 0;
		}
		
		while(num2 != 1) {
			if(num2%2 == 0) {
				num2 /= 2;
			}else {
				num2 = num2*3+1;
			}
		//3�� �����ڷ� ǥ���ϱ�	
		// num2 = (num2%2 == 0) ? num2/2 : num2*3+1;
			
		//	System.out.println(num2);
			answer++;
			if(answer == 500) {
				answer = -1;
				break;
			}
		}
		
		
		
		return answer;
	}
}