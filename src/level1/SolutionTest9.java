package level1;

public class SolutionTest9 {

	public static void main(String[] args) {
		
		NumSum sn = new NumSum();
		
		System.out.println(sn.sol(123));
		
		
	}

}

//�ڸ��� ���ϱ�
class NumSum{
	public int sol(int n) {
		 int answer = 0;
		 
		 // ���ڸ� String�迭�� �־��ֱ�
		 String[] s = String.valueOf(n).split("");
		 
		 // for-each���� �̿��ؼ� ���ϱ�
		 for(String str : s) {
			 answer += Integer.parseInt(str);
		 }
		 
		 return answer;
	}
}