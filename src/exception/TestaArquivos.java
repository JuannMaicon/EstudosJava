package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestaArquivos {

	public static void main(String[] args) {
try {
	System.out.println(ArquivoUtil.lerArquivo("C:\\teste\\arquivo.txt"));
	
} catch (FileNotFoundException e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
}catch(IOException e) {
	
}
System.out.println("continua executando");
	}

}
