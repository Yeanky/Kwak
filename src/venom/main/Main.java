package venom.main;

import java.util.Scanner;

public class Main {
	
	public static void printingtest() {
		for(int i = 0; i < 10; i++) {
			System.out.println("debugging test");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String temp;
		
		System.out.print("plz input ur string! : ");
		temp = sc.nextLine();
		System.out.println(temp);
		printingtest();
	}

}
