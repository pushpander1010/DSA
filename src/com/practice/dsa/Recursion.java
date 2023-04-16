package com.practice.dsa;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hi");
//		System.out.println(sumOfN(3));
//		System.out.println(pow(2,3));
		//Concept check
		int[][] grid= {{1,1,1},{1,1,1},{1,1,1}};
		System.out.println(numberOfWays(grid, 0, 0, 0));
	}
	
	public static void process(Integer  i) {
		for(int j=0;j<10;j++) {
			i++;
		}
	}
	
	public static int sumOfN(int n) {
		int sum=0;
		if(n==0)return sum;
		return (n+sumOfN(n-1));
	}
	
	public static int pow(int a , int n) {
		int prod=1;
		if(n<=0)return 1;
		return a*pow(a,n-1);
	}
	
	public static int numberOfWays(int[][] map,int i, int j,int ways) {
		if(i>=map.length || j>=map[0].length)return 0;
		if(i==map.length-1 && j==map[0].length-1)return 1;
		return numberOfWays(map, i+1, j, ways)+numberOfWays(map, i, j+1, ways);
	}
}
