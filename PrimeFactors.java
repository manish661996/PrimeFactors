package com.bridgelabz.PrimeFactorization;

import java.util.Scanner;

public class PrimeFactors {
	private int IntValue;
	private int PrimeFactors;

	public PrimeFactors() {
		this.IntValue =0;
		this.PrimeFactors =0;
	}

	public void setIntValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value whose prime factorization needs to be done");
		this.IntValue = sc.nextInt();
	}

	public int getIntValue() {
		return this.IntValue;
	}

	public void calcPrimeFactors() {
		for(int i = 2; i< this.getIntValue(); i++) {
			while(this.getIntValue()%i == 0) {
				System.out.println(i+" ");
				this.IntValue = this.getIntValue()/i;
			}
		}
		if(this.getIntValue() >2) {
			System.out.println(this.getIntValue());
		}
	}
}
