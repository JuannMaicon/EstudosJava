package exception;

import java.util.Scanner;

public class TestaMatematica {

	public static void main(String[] args) throws Exception {
		int valor, gerar;
		Scanner scan = new Scanner(System.in);
		do{
			try {
		
System.out.println("Digite o valor: ");
valor = scan.nextInt();
gerar = Matematica.gerarNumero(valor);
break;
		} catch (NumeroInvalidoException err) {
			err.printStackTrace();
			System.out.println(err.getMessage());
		}
	}while(true);

}}
