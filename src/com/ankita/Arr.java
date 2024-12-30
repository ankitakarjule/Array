package com.ankita;

public class Arr {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int min=arr[1];
		while(arr.length<min)
		{
		if(arr[1]>min)
		arr[1]=min;
		}
		
		System.out.println("second min number is"+min);
		}
	}


