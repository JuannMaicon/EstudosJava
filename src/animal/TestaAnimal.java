package animal;

public class TestaAnimal {

	public static void main(String[] args) {
		// Criando Cachorro//
		Cachorro dog1 = new Cachorro();
		dog1.nome = " REX ";
		dog1.raca = " LABRADOR ";
		dog1.latir(1);
		dog1.comer();
		dog1.comer();
		dog1.imprimirCachorro();

		Cachorro dog2 = new Cachorro();
		dog2.nome = "lulu";
		dog2.raca = "York";
		dog2.latir(1);
		dog2.comer();
		dog2.dormir();
		dog2.imprimirCachorro();
		
		System.out.println("Mordida");
		dog1.imprimirCachorro();
		dog2.morder(dog1);
		dog1.imprimirCachorro();

	}

}
