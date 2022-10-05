package level1;

public class SolutionTest37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//시저 암호
class Cipher {
	public String solution(String s, int n) {

		char[] c = s.toCharArray();
		int num = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				if (c[i] >= 'a' && c[i] <= 'z') {
					if (c[i] + n > 'z') {
						num = n - ('z' - c[i]);
						c[i] = (char) ('a' + (num - 1));
					}else {
						c[i] = (char) (c[i] + n);
					}
				}
				else if (c[i] >= 'A' && c[i] <= 'Z') {
					if (c[i] + n > 'Z') {
						num = n - ('Z' - c[i]);
						c[i] = (char) ('A' + (num - 1));
					}else {
						c[i] = (char) (c[i] + n);
					}
				}
			}
		}

		return new String(c);
	}
}