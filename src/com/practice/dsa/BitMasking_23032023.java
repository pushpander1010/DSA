package com.practice.dsa;

import java.util.Scanner;

public class BitMasking_23032023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convertAtoB();
		//getIthBit(3);
		//setIthBit(3);
		clearIthBit(2);
	}
	
	//Bit Masking
	//Get the ith bit
	public static void getIthBit(int i) {
		String bit=Integer.toBinaryString(55);
		System.out.printf("Binary %s \n",bit);
		int mask=1<<i;
		System.out.println(Integer.toBinaryString(mask));
		if((55 & mask)!=0)System.out.println(1);
		else System.out.println(0);
	}
	
	public static void setIthBit(int i) {
		String bit=Integer.toBinaryString(55);
		System.out.printf("Binary %s \n",bit);
		int mask=1<<i;
		System.out.println(Integer.toBinaryString(mask));
		int afterSet=(55|mask);
		System.out.println(Integer.toBinaryString(afterSet));
	}
	
	public static void clearIthBit(int i) {
		String bit=Integer.toBinaryString(55);
		System.out.printf("Binary %s \n",bit);
		int mask=1<<i;
		mask=~mask;
		System.out.println(Integer.toBinaryString(mask));
		int afterSet=(55&mask);
		System.out.println(Integer.toBinaryString(afterSet));	
	}
	
	//Convert a to B
	public static void convertAtoB() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Second Number :");
		int b=scan.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("First : "+a);
		System.out.println("Second : "+b);
	}

}
