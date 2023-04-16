package com.practice.dsa;

public class AdvancedBitManipulation23032023 {
	public int a=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find1();
		
	}
	//============Important==================//
	//Properties of xor
	//1. xor with number itself is 0
	//2. xor of number with 0 is number
	
	
	//a. find the only non repeating number in a list if all numbers repeat twice
	public static void find1() {
		
		int[] arr= {1,2,3,4,2,3,1,4,6};
		int ans=0;
		for(int i:arr) {
			ans=ans^i;
		}
		System.out.println(ans);
		try {
			System.out.println("ds");
		}finally {
			System.out.println("df");
		}
	}
}
