
public class Palindrome {
	public static boolean isPalindrome(String word) {
		boolean result = false;

		String reversed = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}

		if (word.toLowerCase().equals(reversed.toLowerCase())) {
			result = true;
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
