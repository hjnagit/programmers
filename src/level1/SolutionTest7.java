package level1;

public class SolutionTest7 {

	public static void main(String[] args) {
		PhoneNumber ph = new PhoneNumber();
		
		System.out.println(ph.pn("01023424444"));
		
	}

}

class PhoneNumber{
	public String pn(String p) {
		String answer = null;
		
		if(p.length() == 4) {
			return p;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<p.length(); i++) {
			if(i<p.length()-4)	sb.append("*");
			else sb.append(p.charAt(i)+"");
		}
		
		answer = sb.toString();
		
		
		
		//진짜 간단하게 코딩하기
//		char[] ch = p.toCharArray();
//	     for(int i = 0; i < ch.length - 4; i ++){
//	         ch[i] = '*';
//	     }
//	     return String.valueOf(ch);
		
		
		
		return answer;
	}
}