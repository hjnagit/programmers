package level1;

public class SolutionTest40 {

	public static void main(String[] args) {

	}
	
	//�ִ����� �ּҰ���� 
	static int[] solution2(int n, int m) {
		int[] answer = {1,1};
		
		//1. �� �� �߿� �� ���� ���� ã�´�
		int min = (n > m) ? m : n;
		
		//2. �ݺ����� ������ �� ���� ��� �� �������� ã�´� - �ִ�����
		for(int i=1; i<=min; i++) {
			if(n%i == 0 && m%i == 0) {
				answer[0] = i;
			}
		}
		
		//3. �ִ�����*�ּҰ���� = n*m
		answer[1] = n*m/answer[0];
		
		
		return answer;
	}

}
