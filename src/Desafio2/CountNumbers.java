package Desafio2;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		String Continue = "s";
		try {
			
			Scanner Sc = new Scanner(System.in);
			
			System.out.println("Insera um número");
			int InputData = Sc.nextInt();
			
			countNumbers(new int[]{4,3,5,1,7},InputData);
				
		}catch(Exception e) {
			System.out.println("caractere inválido operação finalizada!");
		}
	}
		
	
	public static void countNumbers(int[] vetor, int InputData) {
		int count = 0;
		Arrays.sort(vetor);
		
		for(int num : vetor) {
			if (num < InputData)
				count++;
		}
		System.out.println("existe " + count + " números menores que " + InputData);
	}

}
