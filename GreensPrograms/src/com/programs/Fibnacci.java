package com.programs;

public class Fibnacci {
	public static void fibnacciSeries(int upto) {
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i =2;i<=upto;i++) {
			int c=a+b;
			if(c<=upto) {
				a=b;
				b=c;
				System.out.print(c+" ");
			}
			
			
		}
	}
	
	
public static void main(String[] args) {
	fibnacciSeries(100);
}
}
