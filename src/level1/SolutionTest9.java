package level1;

public class SolutionTest9 {

	public static void main(String[] args) {
		
		NumSum sn = new NumSum();
		
		System.out.println(sn.sol(123));
		
		
	}

}

//자릿수 더하기
class NumSum{
	public int sol(int n) {
		 int answer = 0;
		 
		 // 숫자를 String배열에 넣어주기
		 String[] s = String.valueOf(n).split("");
		 
		 // for-each문을 이용해서 더하기
		 for(String str : s) {
			 answer += Integer.parseInt(str);
		 }
		 
		 return answer;
	}
}