package com.hemebiotech.analytics;

import java.io.IOException;

public class AnalyticsCounter {
/**
 * 
 * @param args
 * @throws Exception
 */
	public static void main(String args[]) throws Exception {

		EcritureFichierSortie sortie = new EcritureFichierSortie();

		try {
			sortie.fichierSortie();
			System.out.println("exportation réussie");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("un problème est apparu, veuillez vérifier. ");
		}

	}
}
