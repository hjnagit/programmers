package level1;

public class SolutionTest5 {

	public static void main(String[] args) {
		
		Harshad h = new Harshad();
		
		
		
		System.out.println(h.solution2(15));
		System.out.println(10/10);
		
	}

}

// 하샤드 -> 숫자 쪼개서 String 배열에 넣기
class Harshad{
	public boolean solution(int x) {
		boolean answer = true;
		
		int sum = 0;
		int num = x;
		
		while(true) {
			sum += num%10;
			num = num/10;
			
			if(num == 0) {
				break;
			}
		}
		
		
		if(x%sum == 0) answer = true;
		else answer = false;
		
		
		return answer;
	}
	
	public boolean solution2(int x) {
		boolean answer = true;
		int sum = 0;
		
		String[] str = String.valueOf(x).split("");
		
		for(String s : str) {
			sum += Integer.parseInt(s);
		}
		
		if(x%sum == 0) answer = true;
		else answer = false;
		
		
		return answer;
	}
}