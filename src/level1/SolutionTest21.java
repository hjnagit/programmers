package level1;

import java.util.Arrays;

public class SolutionTest21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//���￡�� �輭�� ã��
class Kim{
	public String sol(String[] seoul) {
		String answer = "";
        int num = 0;
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				num = i;
				break;
			}
		}
		
		answer = "�輭���� " + num + "�� �ִ�";
		
		return answer;
	}
	
	public String sol2(String[] seoul) {
		int x = Arrays.asList(seoul).indexOf("Kim");
		return "�輭���� " + x + "�� �ִ�";
	}
}