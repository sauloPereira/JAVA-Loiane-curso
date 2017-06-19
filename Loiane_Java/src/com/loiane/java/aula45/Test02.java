package com.loiane.java.aula45;

public class Test02 {
	public static void main (String[]args){
		
		Object obj = obterString();
		String s1 = (String) obj;
		
		System.out.println(obj);
		
		Object obj2 = "Minha String novamente";
		String s2 = (String) obj2;
		
		System.out.println(obj2);
		
	}
	
	public static String obterString(){
		
		return "Minha String";
		
	}
}
