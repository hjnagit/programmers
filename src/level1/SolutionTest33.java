package level1;

public class SolutionTest33 {

	public static void main(String[] args) {
		Price33 p = new Price33();
		
		System.out.println(p.solution(3, 20, 4));
	}

}

//������ �ݾ� ����ϱ�
class Price33{
	public long solution(int price, int money, int count) {
        long answer = money;
		
        for(int i=1; i<=count; i++) {
        	answer -= price*i;
        	//System.out.println(money);
        }
        
        
        
        return (answer < 0) ? -answer : 0;
    }
}