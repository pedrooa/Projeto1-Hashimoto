package br.pro.hashi.ensino.desagil.tequilada;
import java.io.BufferedReader;
import java.lang.StringBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
	    BufferedReader reader = null;
	    
	    try {
	    	File file = new File("/Users/pedroazambuja/Documents/Descob/PedroAzambuja/src/main/java/br/pro/hashi/ensino/desagil/tequilada/labirinto.txt");
	    	reader = new BufferedReader(new FileReader(file));

	    	String line;
	    	line = reader.readLine();

	        while ((line = reader.readLine()) != null) {
	        	StringBuilder newline = new StringBuilder(line);
	        	for (int i = 0; i < newline.length(); i++) {
	        		if (newline.charAt(i) == '#') {
	        			newline.setCharAt(i, 'X');
	        			
	        		}
	        		
	        	}
	            System.out.println(newline);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	  }

}
