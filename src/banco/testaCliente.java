package banco;

public class testaCliente {

	public static void main(String[] args) {
		Cliente c1 =  new Cliente();
		c1.nome = "Chile";
		c1.cpf = "47230408574";
		
		
		ContaCorrente cont1 = new ContaCorrente();
		cont1.nmrconta = "123456";
		cont1.agencia = "3520";
		cont1.titular = c1;
		
		ContaCorrente cont2 = new ContaCorrente();
		cont1.nmrconta = "123456";
		cont1.agencia = "3520";
		cont1.titular = c1;
		
		c1.nome = "Carlos";
		c1 = null;
		System.out.println(cont1.titular.nome);
		System.out.println(cont2.titular.nome);
		

	}

}
