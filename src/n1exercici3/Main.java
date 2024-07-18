package n1exercici3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import utilitats.Entrada;

public class Main {

	public static void main(String[] args) {

		Map<String, String> paisos = new HashMap<String,String>();
		Path pathPaisos = Path.of(System.getProperty("user.dir") + "\\countries.txt");
		Path pathClassificacio = Path.of(System.getProperty("user.dir") + "\\classificacio.txt");
		String nomUsuari = "";
		int puntuacio = 0;
		List<String> llistaPaisos = null;
		
		try (Scanner fitxer = new Scanner(Files.newBufferedReader(pathPaisos))){
			while(fitxer.hasNext()) {
				String key = "", value = "";
				key = fitxer.next();
				value = fitxer.next();
				paisos.put(key, value);
			}
			llistaPaisos = new ArrayList<>(paisos.keySet());
		} catch (IOException e) {
			System.out.println("Error al llegir les dades de " + pathPaisos);
			return;
		}
		
		nomUsuari = Entrada.llegirString("Indica el nom d'usuari: ");
		System.out.println("Benvingut " + nomUsuari);
		
		for(int i = 0; i < 10; i++) {
			String pais = "";
			
			pais = llistaPaisos.remove((int) (Math.random() * llistaPaisos.size()));
			if (paisos.get(pais).equalsIgnoreCase(Entrada.llegirString("Quina és la capital de " + pais + "?"))) {
				System.out.println (String.format("Encert, puntuació: %d", ++puntuacio));
			}else {
				System.out.println(String.format("Error, la resposta era %s", paisos.get(pais)));
			}
		}
				
		System.out.println(String.format("Gràcies per jugar, la teva puntuació final és de %d", puntuacio));
		
		try {
			if(!Files.exists(pathClassificacio)) {
				Files.createFile(pathClassificacio);
			}
			Files.write(pathClassificacio, String.format("\n%s: %d", nomUsuari, puntuacio).getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("Error al guardar la puntuació.");
		}
		
		
		
		
	
		
	}

}
