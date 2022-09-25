package level1;

public class SolutionTest24 {

	public static void main(String[] args) {
		StrBasic sb = new StrBasic();
		
		System.out.println(sb.sol("22293"));
		
		
	}

}

//문자열 다루기 기본 
class StrBasic {
	public boolean sol(String s) {

		String[] str = s.split("");
		
		int num = 0;
		if(str.length != 4 || str.length != 6) {
			return false;
		}
		
		for (int j = 0; j < str.length; j++) {
			for (int i = 0; i < 10; i++) {
				if (str[j].equals(i + "")) {
					num = 1;
				}
				System.out.println(j + "    " + i);
			}
			if(num != 1) {
				return false;
			}
			num = 0;
		}

		return true;
	}
	
	public boolean solution1(String s) {
	      if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	          } catch(NumberFormatException e){
	              return false;
	          }
	      }
	      else return false;
	  }
}