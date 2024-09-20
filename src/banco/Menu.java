package banco;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Cliente[] cliente =new Cliente[5];
		ContaCorrente [] contaCorrente = new ContaCorrente[5];
		double valor;
		int opcao, qtd, posic;
		Scanner scan = new Scanner(System.in);
		
		
		do {		
		System.out.println("Digite a opção desejada. ");
		System.out.println("1- Criar Contas. ");
		System.out.println("2- Criar Clientes.");
		System.out.println("3- Assosiar Cliente a Conta. ");
		System.out.println("4- Realizar Deposito.");
		System.out.println("5- Realizar Transferencia.");
		System.out.println("6- Exibir Dados Do Cliente.");
		System.out.println("7- Exibir Dados Da Conta. ");
		System.out.println("8- Encerrar.");

		opcao = scan.nextInt();
		switch(opcao) {
		case 1:	System.out.println("quantas contas deseja criar?");
		qtd = scan.nextInt();
		contaCorrente = new ContaCorrente[qtd];
		break;
	case 2:
		System.out.println("Quantos clientes deseja criar?");
		qtd = scan.nextInt();
		cliente = new Cliente[qtd];
	default:
		break;
	case 3:
		System.out.println("Qual posição do cliente deseja asociar?");
		posic = scan.nextInt();
		Cliente c = cliente[posic];
		contaCorrente[posic].titular = c;

	case 4:
		
	case 5:
		
	case 6:
		
	case 7:
		
	case 8:
		break;
	}
} while (opcao != 8);
}
}

		