package level1;

public class SolutionTest25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//3진법 뒤집기
class ThreeTen{
	public int solution(int n) {
		
		// 10진수 3진수로 만들기 - 10진수 제외하면 전부 다 String
		String th = Integer.toString(n, 3);
		
		//StringBuilder로 뒤집기
		StringBuilder sb = new StringBuilder(th);
		String th2 = sb.reverse().toString();
		
		//Integer.parseInt(a,3) 3진수 -> 10진수
        return Integer.parseInt(th2,3);
    }
}