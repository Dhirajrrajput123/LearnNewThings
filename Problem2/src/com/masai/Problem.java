package com.masai;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String str="VjkjjjjVdgg";
		int count=1;
		StringBuilder sb=new StringBuilder();
		char ch=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
			else {
				sb.append(count+""+ch);
				ch=str.charAt(i);
				count=1;
			}
		}
		sb.append(count+""+ch);
		
		System.out.println(sb);// 5V4T3K2V
	}
}
