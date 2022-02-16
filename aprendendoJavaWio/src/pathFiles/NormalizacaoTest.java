package pathFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {

	public static void main(String[] args) {
		
		// apenas normalizando Path para demonstração
		
		String diretorioProjeto = "JavaOnLine\\home\\";
		String arquivoTxt = "..\\..\\arquivo.txt";
		Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
		System.out.println(p1);
		System.out.println(p1.normalize());
		

	}

}
