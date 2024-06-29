package in.almeerait;

public class Palindrome {
	
	public boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder();
		String reverseString = sb.reverse().toString();
		if(reverseString.equals(str)) {
			return true;
		}else {
		return false;
		}
	}

}
