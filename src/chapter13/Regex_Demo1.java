package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Demo1 {

	public static void main(String[] args) {
		String regex = "(\\d+)[a-z]";
		String s = "12bksdf34lds56sl";
		Matcher m = Pattern.compile(regex).matcher(s);
		while(m.find()){
			System.out.println("第0组: " + m.group());
			System.out.println("第1组: " + m.group(1));
		}
	}
}
