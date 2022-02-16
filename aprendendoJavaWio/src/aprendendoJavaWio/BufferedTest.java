package aprendendoJavaWio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		
		/*
		File file = new File("Arquivo.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Escrevendo uma mensagem");
			bw.newLine();
			bw.write("E pulando uma linha");
			bw.flush();
			bw.close();
		
			FileReader fr = new FileReader(file);			
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho " + size);
			for(char c: in) {
				System.out.print(c);		
			}
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		File file = new File("Arquivo.txt");
		/*
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Escrevendo uma mensagem");
			bw.newLine();
			bw.write("Pulando uma linha");
			bw.flush();
			bw.close();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while((s=br.readLine()) !=null){
				System.out.println(s);
			}
			br.close();		
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		// economizando linhas de códigos
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				BufferedReader br = new BufferedReader(new FileReader(file))) {
					bw.write("escrevendo uma mensagem");
					bw.newLine();
					bw.write("E pulando uma linha");
					bw.flush();
					String s;
					FileReader fr = new FileReader(file);
					char[] in = new char[500];
					int size = fr.read(in);
					System.out.println("Tamanho " + size);
					while((s = br.readLine()) != null) {
						System.out.println(s);
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}