package fr.formation.inti.numerique;

import java.util.Scanner;

public class Numerique {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input a binary number: ");
		int bin = in.nextInt();
		binaryToHexa(bin);
		System.out.println();
		binaryToDecimal(bin);
		in.close();
	}

	public static void binaryToDecimal(long binaryNumber) {
		
		long decimalNumber = 0, j = 1, remainder;
		while (binaryNumber != 0) {
			remainder = binaryNumber % 10;
			decimalNumber = decimalNumber + remainder * j;
			j = j * 2;
			binaryNumber = binaryNumber / 10;
		}
		System.out.println("Decimal Number: " + decimalNumber);
	}

	public static void binaryToHexa(int bin) {
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0;
		while (bin > 0) {
			rem = bin % 2;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		i = 0;
		while (dec != 0) {
			hex[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		System.out.print("HexaDecimal value: ");
		for (j = i - 1; j >= 0; j--) {
			if (hex[j] > 9) {
				System.out.print((char) (hex[j] + 55) );
			} else {
				System.out.print(hex[j]);
			}
		}
	}
}
