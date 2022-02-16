package aprendendoBasicFile;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;

public class PathMactherTest extends AtributosBasicTest{

	@SuppressWarnings("unused")
	private static Object visitor;

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("unused")
		Path path = Paths.get("arquivo/subpasta/subsubpasta");
		//Files.walkFileTree(path, null);
        // não aparece erro, exception tempo execução
		
		@SuppressWarnings("unused")
		Object start;
		return;
		
	}

	@SuppressWarnings("unused")
	private static Object walkFileTree(Object start, EnumSet<FileVisitOption> noneOf, int maxValue, Object visitor2) {
		
		return null;
	}

}
