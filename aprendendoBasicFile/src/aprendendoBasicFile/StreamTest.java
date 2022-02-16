package aprendendoBasicFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {
 
	public static void main(String[] args) {
		leitor();
		gravador();
	}

		private static void gravador() {
			byte[] dados = {65,66,67,68,69,70};
			try(FileOutputStream gravador = new FileOutputStream("arquivo.txt")){
				
				gravador.write(dados);
				//for(Byte b: dados) {
					//gravador.write(b);
					System.out.println("Dados gravados com sucesso");
				}
				catch (IOException e) {
					e.printStackTrace();
			} 
		}
		@SuppressWarnings("unused")
		private static void leitor() {
			try(FileInputStream leitor = new FileInputStream("arquivo.txt")){
				int leitura;
				while((leitura = leitor.read()) != -1){
					byte b = (byte) leitura;
					System.out.println("" + b);
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}