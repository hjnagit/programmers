package level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SolutionTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<b; i++) {
        	for(int j=0; j<a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        
        // �ٸ� Ǯ��

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));

	}

}