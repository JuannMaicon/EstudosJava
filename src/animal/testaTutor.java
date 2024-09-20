package animal;

public class testaTutor {

	public static void main(String[] args) {
		//Criando um objeto(anonimo)
		new Cachorro("Brunelas","Sem Raça Definida").latir(50);
		
		
		//criar um tutor//
		Tutor tutor = new Tutor();
		tutor.nome = "Sarti";
		tutor.tel = "123456789";
		tutor.end = "Rua interlagos";
		
		//Criar um cachorro//
		Cachorro dog1 = new Cachorro();
		dog1.nome = "REX";
		dog1.raca = "Labrador";
		dog1.tutor = tutor;
		
		Cachorro dog2 = new Cachorro();
		dog2.nome = "LOLO";
		dog2.raca = "Poodle";
		dog2.tutor = tutor;
		
		dog2.tutor.nome = "Anderson";
		System.out.println(dog1.tutor.nome);
		System.out.println(dog2.tutor.nome);
		System.out.println(tutor.nome);
		
		//criando dog3 com construtor
		Cachorro dog3 = new Cachorro("Lili", "Vira lata", tutor);

	}

}
