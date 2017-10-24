package chapter13;

import java.util.Scanner;

public class Regex_Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("12 , 34  , 56,78");
		sc.useDelimiter("\\s*,\\s*");
		while(sc.hasNextInt()){
			System.out.println(sc.nextInt());
		}
	}
}
