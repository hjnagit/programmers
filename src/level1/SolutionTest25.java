package level1;

public class SolutionTest25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//3���� ������
class ThreeTen{
	public int solution(int n) {
		
		// 10���� 3������ ����� - 10���� �����ϸ� ���� �� String
		String th = Integer.toString(n, 3);
		
		//StringBuilder�� ������
		StringBuilder sb = new StringBuilder(th);
		String th2 = sb.reverse().toString();
		
		//Integer.parseInt(a,3) 3���� -> 10����
        return Integer.parseInt(th2,3);
    }
}