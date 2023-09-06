package camadapilha;

import java.util.Stack;
import java.util.Scanner;

public class CamadaPilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Menu");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Finalizar o programa");
			opcao = Integer.parseInt(sc.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				String livro = sc.nextLine().trim();
				pilha.push(livro);
				System.out.println("Livro " + livro + " adicionado na pilha.");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("A pilha tem " + pilha.size() + " livros.");
					for (String l : pilha) {
						System.out.println(l);
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String retirado = pilha.pop();
					System.out.println("Livro " + retirado + " retirado da pilha.");
				}
				break;
			case 0:
				System.out.println("Obrigado por usar o programa. Até mais!");
				break;
			default:
				System.out.println("Opção inválida. Digite um número entre 0 e 3.");
			}
		} while (opcao != 0);

		sc.close();
	}

}
