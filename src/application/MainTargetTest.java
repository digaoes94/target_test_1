package application;

import java.util.Scanner;
import java.util.ArrayList;

public class MainTargetTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Resposta da questão 1: " + questao1());
		System.out.println();
		
		System.out.print("Favor informar o valor a buscar na sequência Fibonacci: ");
		int valor = scan.nextInt();
		if (questao2(valor)) {
			System.out.println("Resposta da questão 2: faz parte da sequência Fibonacci.");
		}
		else {
			System.out.println("Resposta da questão 2: não faz parte da sequência Fibonacci.");
		}
		
		
	}

	//  QUESTÃO 1
	public static int questao1() {
		int index = 13, soma = 0, k = 0;
		
		while (k < index) {
			k += 1;
			soma += k;
		}
		
		return soma;
	}
	
	//  QUESTÃO 2
	public static boolean questao2(int valor) {
		boolean fazParte = false;
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		
		int x = 0;
		
		while (x < valor) {
			fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
			x = fibonacci.get(fibonacci.size() - 1);
		}
		
		if (x == valor) {
			fazParte = true;
		}
		else {
			fazParte = false;
		}
		
		return fazParte;
	}
	
	
}