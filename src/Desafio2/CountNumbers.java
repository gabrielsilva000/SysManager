package Desafio2;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		String Continue = "s";
		try {
			
			Scanner Sc = new Scanner(System.in);
			
			System.out.println("Insera um n�mero");
			int InputData = Sc.nextInt();
			
			countNumbers(new int[]{4,3,5,1,7},InputData);
				
		}catch(Exception e) {
			System.out.println("caractere inv�lido opera��o finalizada!");
		}
	}
		
	
	public static void countNumbers(int[] vetor, int InputData) {
		int count = 0;
		Arrays.sort(vetor);
		
		for(int num : vetor) {
			if (num < InputData)
				count++;
		}
		System.out.println("existe " + count + " n�meros menores que " + InputData);
	}

}
