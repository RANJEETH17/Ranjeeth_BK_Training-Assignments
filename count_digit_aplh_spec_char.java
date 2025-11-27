package javatraining;

public class count_digit_aplh_spec_char {
	 public static void main(String[] args) {
	        String str = "Hello123@#";

	        int letters = 0, digits = 0, special = 0;

	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else {
	                special++;
	            }
	        }

	        System.out.println("Letters: " + letters);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special Characters: " + special);
	    }
}
