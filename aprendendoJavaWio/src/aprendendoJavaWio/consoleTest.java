package aprendendoJavaWio;

import java.io.Console;

public class consoleTest {

	public static void main(String[] args) {
		
		Console c = System.console();
		char[] pw = c.readPassword("\s","pw:");
		for(char pass : pw) { 
			c.format("\s",pass);
		}
		c.format("\n");
		String texto;
		while(true) {
			texto = c.readLine("\s","digite");
			c.format("este texto já foi digitado",retorno(texto));
			
		}
		
		// para conhecimento da classe console e certificação
		// geralmente não é utilizada a classe console
		
	}
	private static Object retorno(String texto) {
			return null;
	}
	//public static String retorno(String arg1) {
		//return arg1;
	 //}

}
