package venom.main;

import java.util.Scanner;

import venom.main.calculation.Addclass;
import venom.main.calculation.Multiclass;
import venom.main.calculation.Subclass;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
				
		Addclass tempadd = new Addclass(x, y);
//		tempadd.actCal();
//		new Addclass(x, y).actCal();
//		new Subclass(x, y).actCal();
		tempadd.printCal();
		
		Subclass tempsub = new Subclass(x, y);
//		tempsub.actCal();
		tempsub.printCal();
		
		tempadd.setX(30);
		tempadd.setY(10);
//		tempadd.actCal();
		tempadd.printCal();
		
		Multiclass tempmul = new Multiclass(x, y);
		tempmul.printCal();
		
	}

}
