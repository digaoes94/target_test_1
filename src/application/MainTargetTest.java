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
		System.out.println();
		
		System.out.print("Favor informar a palavra a inverter: ");
		String original = scan.next();
		System.out.println(questao3(original));
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
	
	/*
	 * QUESTÃO 3
	 * a) += 2;                 Próximo número = 9
	 * b) *= 2;                 Próximo número = 128
	 * c) = Math.pow(n, 2);     Próximo número = 49
	 * d) ?;                    Próximo número = 100 (4x25)
	 * e) fibonacci;            Próximo número = 13
	 * f) ???
	 */
	
	/*
	 * QUESTÃO 4
	 * Primeiro passo: ligar dois interruptores, de forma aleatória, e anotar os interruptores e as salas em que as lâmpadas foram ligadas
	 * 
	 * Segundo passo: manter aceso um dos dois interruptores que foram ligados antes, e alternar os dois interruptores (o 2° que foi ligado antes
	 * e o que estava desligado) de estado. A sala que ligar a luz, nesse passo, é a que teve seu interruptor ligado no 2° passo,
	 * e a lâmpada que desligar é a que teve seu interruptor ligado no 1° passo, mas desligado no segundo. A sala em que a luz se manteve ligada
	 * após o 2° passo é aquela que não teve seu interruptor alternado no 2° passo.
	 */
	
	//  QUESTÃO 5
	public static String questao3(String original) {
		String inversa = "";
		
		for (int i = 0; i < original.length(); i++) {
			inversa = original.charAt(i) + inversa;
		}
		
		return inversa;
	}
}