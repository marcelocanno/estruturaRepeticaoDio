package aprendendoBasicFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.jar.Attributes;

import javax.naming.directory.BasicAttributes;

public class AtributosBasicTest {

	public static void main(String[] args) throws IOException {
		
		Date primeiroDeDezembro = new GregorianCalendar(2015,Calendar.DECEMBER,1).getTime();
		File file = new File("arquivo.txt");
		file.createNewFile();
		file.setLastModified(primeiroDeDezembro.getTime());
		System.out.println(file.lastModified());
		
		file.delete();
		Path path = Paths.get("arquivo.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
		Files.setLastModifiedTime(path, fileTime);
		System.out.println(Files.getLastModifiedTime(path));
		Files.deleteIfExists(path);
		
		path = Paths.get("arquivo.txt");
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isExecutable(path));
		
		// BasicFileAttributes
		// PosixFileattributes Linux
		// DosFileAttributes windows
		// não apresenta erro mas apresenta exception
		// acerta no futuro
		
		
		/*
		BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
		{
	       // return ((Object) provider(path)).readAttributes(path);
		}
		System.out.println(atributosBasicos.creationTime());
		System.out.println(atributosBasicos.lastAccessTime());
		System.out.println(atributosBasicos.lastModifiedTime());
		System.out.println(atributosBasicos.isDirectory());
		System.out.println(atributosBasicos.isSymbolicLink());
		System.out.println(atributosBasicos.isRegularFile());
		System.out.println(atributosBasicos.isDirectory());
		
		
		// basicFileAttributeView
		// PosixFileAttributeView
		// DosFileAttributeView
		// FileOwnerAttributeView
		// AciFileAttributeView
		 
		 
		 FileTime lastModifieed = atributosBasicos.lastModifiedTime();
		 FileTime created = atributosBasicos.creationTime();
		 FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
		 BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		 basicView.setTimes(lastModifieed, lastAcess, created);
		 atributosBasicos = Files.readAttributes(path,BasicFileAttributes.class);
		 System.out.println(atributosBasicos.creationTime());
		 System.out.println(atributosBasicos.lastAccessTime());
		 System.out.println(atributosBasicos.lastModifiedTime());
	}
	     
		
	private static Object provider(Path path) {
		
		return null;
	}
	*/
	}
	}
 
