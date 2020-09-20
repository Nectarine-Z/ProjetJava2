package com.hemebiotech.analytics;

import java.io.IOException;
/**
 * generating the output file. Create new object of EcritureFichierSortie and generate file result.out.
 * @author Françoise Zimmer
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
			System.out.println("exportation réussie");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("un problème est apparu, veuillez vérifier . ");
		}

	}
}
