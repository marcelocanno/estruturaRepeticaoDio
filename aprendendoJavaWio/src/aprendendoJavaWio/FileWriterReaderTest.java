package aprendendoJavaWio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		try {
			//System.out.println(file.createNewFile());	
			//boolean exists = file.exists();
			//System.out.println("permissão de leitura " + file.canRead());
			//System.out.println("Paty " + file.getPath());
			//System.out.println("Paty " + file.getAbsolutePath());
			//System.out.println("Diretório " + file.isDirectory());
			//System.out.println("Hidden " + file.isHidden());
			//System.out.println("Last modified " + new Date(file.lastModified()));
			FileWriter fw = new FileWriter(file);
			fw.write("Escrevendo uma mensagem no arquivo\n e pulando uma linha 3");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho " + size);
			for(char c : in) {
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
		
	}

}
