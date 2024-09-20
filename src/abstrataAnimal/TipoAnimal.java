package abstrataAnimal;

public enum TipoAnimal {
	PEIXES("Peixes",1),
	REPITEIS("Repiteis",2), 
	ANFIBIOS("Anfibios",3),
	MAMIFEROS("Mamiferos",4);
	String descricao;
	int ordem;
	
	TipoAnimal(String descrisao, int ordem){
		this.descricao = descricao;
		this.ordem = ordem;
	}
	
	@Override
	public String toString() {
		return descricao;
		
	}

}
