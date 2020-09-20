package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
/**
 * Gets list of the symptoms is collected from the file provided (ReadSymptomDataFromFile)
 *    counts and returns the frequency of symptoms that have previously been read.         
 * @author Françoise Zimmer
 *
 */
public class SortAlphabetically {

	/**
	 *       
	 * @return TreeMap : symptoms sorted and counted.
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
