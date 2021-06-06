package com.patterns;

public class StarPattern3 {
	
	/*	---*
		--**
		-***
	   *****
	*/

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			//This is for space 
			for(int j=3; j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
