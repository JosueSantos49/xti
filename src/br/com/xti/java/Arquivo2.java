package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*Exemplo de Streams para manipulação de caracteres*/
public class Arquivo2 {

	public static void main(String[] args) throws IOException {
				
		Path path = Paths.get("C:\\Users\\conce\\eclipse-workspac/xti/files/texto.txt");

		Charset utf8 = StandardCharsets.UTF_8;
		
		/*ESCRITA*/
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)){			
			w.write("Outro Texto\n");
			w.write("Outro Texto");			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		/*LEITURA*/
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)){			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
