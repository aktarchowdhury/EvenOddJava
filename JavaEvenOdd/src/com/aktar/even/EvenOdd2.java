package com.aktar.even;
import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args) {
	int n;
	System.out.println("input an integar to have even or odd number");
	Scanner out=new Scanner(System.in);
	n=out.nextInt();
	if(n%2==0){
		System.out.print("its an odd number");		
	}else{
		System.out.println("its an even number");
	}
	}
}
