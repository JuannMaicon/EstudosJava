package biblioteca;

import java.util.Calendar;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setIsbn("111111111");
		Calendar dataLancamento = Calendar.getInstance();
		dataLancamento.set(Calendar.DAY_OF_YEAR, 1);
		dataLancamento.set(Calendar.MONTH, 0);
		dataLancamento.set(Calendar.YEAR, 2000);

		livro.setDataLancamento(dataLancamento);
		livro.setTitulo("Meu livro");
		livro.setEdicao(1);
		livro.setNumPaginas(200);

		Autor autor = new Autor();
		autor.setGeneroLiterario("Romance");
		autor.setNome("Machado de assis");
		livro.setAutor(autor);
		
		System.out.println(livro.getTitulo());
		System.out.println(livro.getAutor().getNome());
		System.out.println(livro.getDataLancFmt());
		livro.getAutor().setNome("Jubileu pessoa");
		
		
		
		
		
		

	}

}
