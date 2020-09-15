package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class SortAlphabetically {

	/**
	 * 
	 * @param liste : prends la liste des symptomes récupérés depuis le fichier
	 *              fourni.
	 * @return : TreeMap compte et retourne la fréquence des symptoms qui viennent d'être lus.
	 */
	public TreeMap<String, Integer> counters() {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> liste = reader.getSymptoms();
		TreeMap<String, Integer> counters = new TreeMap<>();
		
		for (String symptom : liste) {
			if (!counters.containsKey(symptom)) {
				counters.put(symptom, Collections.frequency(liste, symptom));
			}
		}
		return counters;

	}

}
