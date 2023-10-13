package programm;

import java.util.Scanner;
import java.lang.*;

public class Fibonaccisequence {

	public static void main(String[] args) {
		int firstTerm=0;
		int secondTerm=1;
		int nextTerm=0;
	
		System.out.println("enter No. up to fibonacci sequence require");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(firstTerm);
		System.out.println(secondTerm);
		for(int i=3;i<=n;i++) {
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
			System.out.println(nextTerm);
			}
		

	}

}
