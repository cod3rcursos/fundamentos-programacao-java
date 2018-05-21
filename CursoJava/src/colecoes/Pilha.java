package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.push("O pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		
		System.out.println("pop...");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		pilha.poll();
		//System.out.println(pilha.pop());
	}

}
