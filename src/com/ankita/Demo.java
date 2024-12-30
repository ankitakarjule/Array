package com.ankita;

public class Demo {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]= {100,200,300,400,500};
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[1]);//direct access
		System.out.println("----------------------");
		//print by using for loop 
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("----------------------");
		//print by using for each loop
		for(int i:b)
		{
			System.out.println(i);
		}
	}

}
