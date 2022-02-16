package aprendendoBasicFile;

import java.io.IOException;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class AcharTodosOsBkp extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if(file.getFileName().toString().endsWith(".bkp")) { 
			System.out.println(file.getNameCount());
		}
		return FileVisitResult.CONTINUE;
	}
}
public class FileVisitorTest {

	private static Object start;

	public static void main(String[] args) {
		try {
			Files.walkFileTree(Paths.get(".bkp"), new PrintDirs());
	        return;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private static Object walkFileTree(Object start2) {
			return null;
	}
	// sistema não efetuou a leitura por não encontrar o caminho
	// nome de pastas não localizados

	public static Object getStart() {
		return start;
	}

	public static void setStart(Object start) {
		FileVisitorTest.start = start;
	}
	
}

class PrintDirs extends  SimpleFileVisitor<Path>{
	public FileVisitResult preVisitDiretory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre : "+ dir);
		return FileVisitResult.CONTINUE;
}


	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println("file : " + file.getFileName());
		return FileVisitResult.CONTINUE;
	}
	@Override
	public FileVisitResult visitFileFailed(Path file,IOException exc)
	throws IOException {
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult postVisitDiretory(Path dir, IOException exc) {
		System.out.println("post : " + dir);
		return FileVisitResult.CONTINUE;
	}
}



