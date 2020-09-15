package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
/**
 * 
 * écriture du fichier des résultats après avoir trié et compté les symptoms;
 *
 */
public class EcritureFichierSortie {
	public void fichierSortie() throws IOException {
		SortAlphabetically alpha = new SortAlphabetically();
		TreeMap<String, Integer> map = alpha.counters();
		FileWriter writer = new FileWriter("result.out");
		map.forEach((K, V) -> {
			try {
				writer.write(K + " = " + V + " \n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		writer.close();

	}
}
