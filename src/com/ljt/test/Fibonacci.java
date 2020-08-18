package com.ljt.test;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fi(10);
	}
	
	public static void Fi(int N) {
			long f0 = 0;
			long f1 = 1;
			
			for(int i=0;i<N;i++) {
				
				if(i == 0) {
					System.out.println(f0);
				} else if(i == 1) {
					System.out.println(f1);
				} else {
					long fn = f0+f1;
					System.out.println(fn);
					f0 = f1;
					f1 = fn;	
				}
				
			
			}
		
	}

}
