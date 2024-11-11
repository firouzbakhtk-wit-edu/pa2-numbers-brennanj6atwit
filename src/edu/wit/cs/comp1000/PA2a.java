package edu.wit.cs.comp1000;

import java.util.Scanner;

/** Solution
 * Read user input for 5 whole numbers, calculate sums & avgs of groups of numbers
 * @author jackbrennan
 */

public class PA2a {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter five whole numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
		int sumpos = 0;
		double posavg = 0;
		double posc = 0;
		
		int totalsum = (a+b+c+d+e);
		double totalavg = ((a+b+c+d+e) / 5.0);
	
		
		if (a  > 0) {
			sumpos = sumpos+a;
			posc++;			
		}
		if (b > 0) {
			sumpos = sumpos+b;
			posc++;
		}
		if (c > 0 ) {
			sumpos = sumpos+c;
			posc++;
		}
		if (d > 0 ) {
			sumpos = sumpos+d;
			posc++;
		}
		if (e > 0) {
			sumpos = sumpos+e;
			posc++;
		}
		if (posc > 0) posavg=sumpos/posc;
		
		
		int sumneg=0;
		double negavg=0;
		double negc=0;
		
		if (a<=0) {
			sumneg = sumneg+a;
			negc++;
		}
		if (b<=0) {
			sumneg = sumneg+b;
			negc++;
		}
		if (c<=0) {
			sumneg = sumneg+c;
			negc++;
		}
		if (d<=0) {
			sumneg = sumneg+d;
			negc++;
		}
		if (e<=0) {
			sumneg = sumneg+e;
			negc++;
		}
		if (negc>0) negavg=sumneg/negc;
		
		if (posc==1) {
			System.out.printf("The sum of the %.0f positive number: %d%n", posc, sumpos);
			} else {
			System.out.printf("The sum of the %.0f positive numbers: %d%n", posc, sumpos);
			}
		
		if (negc==1) {
			System.out.printf("The sum of the %.0f non-positive number: %d%n", negc, sumneg);
			} else {
			System.out.printf("The sum of the %.0f non-positive numbers: %d%n", negc, sumneg);
			}
		System.out.printf("The sum of the 5 numbers: %d%n", totalsum);
		if (posc==1) {
			System.out.printf("The average of the %.0f positive number: %.2f%n", posc, posavg);
		} else {
			System.out.printf("The average of the %.0f positive numbers: %.2f%n", posc, posavg);
		
		}
		if (negc==1) {
			System.out.printf("The average of the %.0f non-positive number: %.2f%n", negc, negavg);
		} else {
			System.out.printf("The average of the %.0f non-positive numbers: %.2f%n", negc, negavg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", totalavg);
		
		input.close();
		
		}

	
}
