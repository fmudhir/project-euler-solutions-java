package eulerProblem;

public class P4 {

	public static void main(String[] args) {


		int range = 999;
		int palindrome = 0;
		for (int i = range; i > 0; i--) {
			for (int j = range; j > 0; j--) { 
				if (isPalindrome(i * j)) 
					if (i * j > palindrome)
						palindrome = i * j;
			}
		}
		System.out.println(palindrome);
	}

	
	private static boolean isPalindrome(int n) {
		String str = String.valueOf(n);
		String reverse = "";
		for (int i = str.length() - 1; i > -1; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse.equals(str);
	}

}
