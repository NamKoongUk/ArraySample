package com.kh.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {

		int[] iarr = new int[10];

		for(int i=0; i<iarr.length; i++) {
			iarr[i]=  new Random().nextInt(100)+1;
			System.out.println("iarr["+i+"]의 값 : " + iarr[i]);
		}
		int sum=0;
		for(int i=0; i<iarr.length; i++) {
			sum+=iarr[i];
		}
		System.out.println("랜덤한 수의 합계는 : " +sum);
	}

	public void test2() {
		int[] iarr1 = new int[10];

		int max=0;
		int min=0;
		for(int i=0; i<iarr1.length; i++) {
			iarr1[i]= (int)(Math.random()*100)+1;
			System.out.println("iarr["+i+"]의 값 : " + iarr1[i]);

		}
		for(int i=0; i<iarr1.length; i++) {
			if(iarr1[i] >max) {
				max=iarr1[i]; 
			}

		}

		min=iarr1[0];
		for(int i=1; i<iarr1.length; i++) {
			if(iarr1[i] < min) {
				min= iarr1[i];

			}

		}
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : "+ min);


	}
	public void test3() {

		byte[] barr = new byte[10];
		int sum=0;
		for(int i=0; i<barr.length; i++) {
			barr[i]=(byte)(new Random().nextInt(255)-127);
			if(barr[i]%2==0) {
				sum+=barr[i];
			}
		}
		System.out.println("짝수들의 합계 : " +sum);

	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자로된 문자열을 입력하시오 : ");
		String str = sc.nextLine();

		int sum=0;
		int[] str2 = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			str2[i] = Integer.parseInt(str.substring(i, i+1));
			sum+=str2[i];
		}
		System.out.println(sum);
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자로된 문자열을 입력하시오 : ");
		String str = sc.nextLine();

		int sum=0;
		int[] str2 = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			str2[i] = (int)str.charAt(i)-48;
			sum+=str2[i];
		}
		System.out.println(sum);
	}
	


}
