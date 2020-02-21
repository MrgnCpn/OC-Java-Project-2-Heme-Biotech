package com.hemebiotech.analytics;

/**
 * 
 * @author MrgnCpn
 *
 */
public class AnalyticsCounter {
	/**
	 * Program who read list of symptoms in file and write then with their count in output file
	 * @param fileInput : Path of input file
	 * @param fileOutput : Path of output file
	 */
	public void analyse(String fileInput, String fileOutput) {
		ReadSymptomsDataFromFile symptomsFileReader = new ReadSymptomsDataFromFile(fileInput);
		WriteSymptomsDataToFile symptomsFileWriter = new WriteSymptomsDataToFile(fileOutput);
		
		symptomsFileWriter.writeSymptoms(
				symptomsFileReader.sortSymptomsByKey(
						symptomsFileReader.getSymptoms()
				),
		true, true);
	}
	
	/**
	 * Application processing
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.analyse("Project02Eclipse/symptoms.txt", "Project02Eclipse/result.out");
	}
}
