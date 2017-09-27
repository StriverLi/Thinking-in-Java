package chapter4;

import java.util.Arrays;

public class VampireNumber {
	/*
	 * 吸血鬼数字：
	 * 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，
	 * 而这对数字各包含乘积的一半位数的数字，其中从最初的数字中选取的数字可以任意排序。
	 * 以两个0结尾的数字是不允许的
	 * 
	 * 要求：找出所有的四位吸血鬼数字
	 * 
	 */

	public static void main(String[] args) {
		for(int i = 10; i < 100; i++){
			for(int j = i; j < 100; j++){
				int temp = i*j;
				if(temp%100 == 0) // 不能是以两个0结尾的数字
					continue;
				String str1 = temp+""; // 结果
				String str2 = i + "" + j; // 乘数
				
				if(str1.length() != str2.length())
					continue;
				char[] product = str1.toCharArray();
				char[] mul = str2.toCharArray();
				Arrays.sort(product);
				Arrays.sort(mul);
				boolean b = true;
				for(int k = 0; k < product.length; k++){
					if(product[k] != mul[k]){
						b = false;
						break;
					}
				}
				if(b){
					System.out.println(i + "*" + j + "=" + temp);
				}
			}
		}
	}
}
