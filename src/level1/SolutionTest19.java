package level1;

public class SolutionTest19 {

	public static void main(String[] args) {
		SB sb = new SB();
		
		System.out.println(sb.sol(5));
		
		
		
	}

}


//���ڼ��ڼ�??
class SB{
	public String sol(int n) {
		//String answer = "";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sb.append("��");
			}else {
				sb.append("��");
			}
		}
		
		//answer = sb.toString();
		
		return sb.toString();
	}
}