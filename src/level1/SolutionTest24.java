package level1;

public class SolutionTest24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//���ڿ� �ٷ�� �⺻ 
class StrBasic{
	public boolean sol(String s) {
		
		for(int i=0; i<10; i++) {
			if(!(s.contains(i+""))) {
				return false;
			}
		}
		
		
		return true;
	}
}