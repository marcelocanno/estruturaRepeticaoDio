package aprendendoBasicFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BasicFileTest {

	public static void main(String[] args) throws IOException {
		
		// o modelo aqui aplicado foi desenvolvido IDE Intellij
		// aqui no Eclipse tem apresentado exception
		// aqui não apresenta erro, quando roda da exception
		// solução no futuro
		
		Date primeiroDeDezembro = new GregorianCalendar(2005, Calendar.DECEMBER,1).getTime();
		File file = new File("folder2\\arquivo.txt");
		//try {
			//file.createNewFile();
		//} catch (IOException e) {
			//e.printStackTrace();
		//}
		file.setLastModified(primeiroDeDezembro.getTime());
		System.out.println(file.lastModified());
		file.delete();
		Path path = Paths.get("folder2\\arquivo_path.txt");
		/*
		try {
			Files.createFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
		//try {
			//Files.setLastModifiedTime(path, fileTime);
		//} catch (IOException e) {
			//e.printStackTrace();
		//}
		/*
		try {
			System.out.println(Files.getLastModifiedTime(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		path = Paths.get("\\carro.java");
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isExecutable(path));
		
	}

	}

