package api;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsumoApiBasico {
	
	// para consumir una Api e imprimir un String con la info
	// tutorial de Gogodev
	// https://www.youtube.com/watch?v=GmL1Nmj9TqY&ab_channel=GOGODEV
	
	public static void apiAString(String url) {
		
		try {
			URL urlObject = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) urlObject.openConnection();
			conn.setRequestMethod("GET");	
			conn.connect();
			
			int responseCode = conn.getResponseCode();
			
			if (responseCode != 200) {
					throw new RuntimeException("Ocurrió un error" + responseCode);
			} else {
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(urlObject.openStream());
				
				while (scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}
				
				scanner.close();
				
				System.out.println(informationString);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
