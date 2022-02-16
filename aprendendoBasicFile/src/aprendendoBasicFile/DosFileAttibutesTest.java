package aprendendoBasicFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttibutesTest {

	public static void main(String[] args) {
		
		/*
		Path path = Paths.get("folder2\\teste.txt");
		
		try {
			
			// não apresenta erro mas na execução exception = Files.createFile(path);
			// solução no futuro
			
			Files.createFile(path);
			Files.setAttribute(path,"dos:hidden",true);
			Files.setAttribute(path, "dos:readonly",true);
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(dos.isHidden());
			System.out.println(dos.isReadOnly());
			Files.setAttribute(path,"dos:hidden",false);
			Files.setAttribute(path, "dos:readonly",false);
			
			dos = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println(dos.isHidden());
			System.out.println(dos.isReadOnly());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

	private static Files provider(Path path) {
			return null;
	}
 		*/
	}
}
