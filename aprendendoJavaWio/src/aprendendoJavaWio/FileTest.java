package aprendendoJavaWio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args)  {
		
		File file = new File("Arquivo.txt");
		try {
			System.out.println(file.createNewFile());	
			boolean exists = file.exists();
			System.out.println("permissão de leitura " + file.canRead());
			System.out.println("Paty " + file.getPath());
			System.out.println("Paty " + file.getAbsolutePath());
			System.out.println("Diretório " + file.isDirectory());
			System.out.println("Hidden " + file.isHidden());
			System.out.println("Last modified " + new Date(file.lastModified()));
			if(exists) {
				System.out.println("Deletado " + file.delete());
			}
			//boolean newFile = file.createNewFile();
			//System.out.println(newFile);
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
		
}


