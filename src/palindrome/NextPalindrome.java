package palindrome;

public class NextPalindrome {

	public static int getNextPalindrome(int input) {
		// Increment the input in case input itself is a palindrome.
		input++;
		String inputAsStr = Integer.valueOf(input).toString();
				
		while (!isPalindrome(inputAsStr)) {
			input++;
			inputAsStr = Integer.valueOf(input).toString();
		}

		return Integer.parseInt(inputAsStr);
	}

	private static boolean isPalindrome(String inputAsStr) {
		char[] inputArray = inputAsStr.toCharArray();
		int start = 0;
		int end = inputArray.length - 1;
		
		while (start < end ) {
			if (inputArray[start] != inputArray[end]) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		
		return true;
	}

}
