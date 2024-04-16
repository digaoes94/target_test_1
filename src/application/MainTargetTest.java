package application;

import java.util.Scanner;
import java.util.ArrayList;

public class MainTargetTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Resposta da questão 1: " + questao1());
		
		System.out.print("Favor informar o valor a buscar na sequência Fibonacci: ");
		int valor = scan.nextInt();
		if (questao2(valor) == true) {
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
	
	public static boolean questao2(int valor) {
		boolean fazParte = false;
		int x = 0;
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		
		while (x < valor) {
			int count = 2;
			
			if (x == valor) {
				fazParte = true;
				break;
			}
			else if (x > valor) {
				fazParte = false;
				break;
			}
			else {
				fibonacci.add((fibonacci.get(count - 1) + fibonacci.get(count - 2)));
				count++;
			}
		}
		
		return fazParte;
	}
	
	
}