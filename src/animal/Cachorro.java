package animal;

public class Cachorro {
	// Atributos (Estado)//
	public String nome;
	public String raca;
	private boolean fome = true;
	public Tutor tutor;
	
	//Construtores//
	public Cachorro(){
		this.fome = true;
		
	}
	public Cachorro(String nome,String raca) {
    this();
    this.nome = nome;
    this.raca = raca;
    
	}
	public Cachorro(String nome, String raca, Tutor tutor) {
		this(nome, raca);
		this.tutor = tutor;
	}

	// Metodos(Conportamneto)//
	public void latir(int latindo) {
		System.out.println(this.nome + " Latindo:");
		for (int i = 0; i < latindo; i++) {
			System.out.println("Au Au");
		}
	}

	public void imprimirCachorro() {
		System.out.printf("Nome: %s%nRaça: %s%n", this.nome, this.raca);
		// condição? valor se v : valor se f//
		System.out.println(fome ? "Estou com fome" : "Não estou com fome");

	}

	public void comer() {
		if (fome) {
			fome = false;
		}
	}

	public void dormir() {
		System.out.println("ZZZZZZZ");
		fome = true;
	}

	private void chorar() {
		System.out.println("kain kain kain");
	}

	public void morder(Cachorro dog) {
		dog.chorar();
		dog.fome = true;

	}
}
