package com.hemebiotech.analytics;

import java.io.IOException;
/**
 * generating the output file. Create new object of EcritureFichierSortie and generate file result.out.
 * @author Fran�oise Zimmer
 * 
 */
public class AnalyticsCounter {
/**
 *  generating the output file.
 * 
 * @throws Exception if exportation fail.
 */
	public static void main(String args[]) throws Exception {

		EcritureFichierSortie sortie = new EcritureFichierSortie();

		try {
			sortie.fichierSortie();
			System.out.println("exportation r�ussie");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("un probl�me est apparu, veuillez v�rifier . ");
		}

	}
}
