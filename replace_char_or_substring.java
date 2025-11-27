package javatraining;

public class replace_char_or_substring {
	public static void main(String[] args) {
        String str = "hello world";
        String newStr = str.replace('l', 'x');

        System.out.println(newStr);  // hexxo worxd
        String str1 = "I love Java";
        String newStr1 = str1.replace("Java", "Python");

        System.out.println(newStr1);  // I love Python
    }

}
