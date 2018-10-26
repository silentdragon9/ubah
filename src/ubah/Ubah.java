/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ubah {
    
    public static void main(String[] args) {
                  
  
//public class CrunchifyCSVtoArrayList {
	//public static void main(String[] args) {
		
		BufferedReader crunchifyBuffer = null;
		
		try {
			String crunchifyLine;
			crunchifyBuffer = new BufferedReader(new FileReader("C:/Users/User06/Documents/NetBeansProjects/ubah/B.txt"));
			
			// How to read file in java line by line?
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				System.out.println("Raw CSV data: " + crunchifyLine);
				System.out.println("Converted ArrayList data: " + crunchifyCSVtoArrayList(crunchifyLine) + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (crunchifyBuffer != null) crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}
	}
	
	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV) {
		ArrayList<String> crunchifyResult = new ArrayList<String>();
		
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					crunchifyResult.add(splitData[i].trim());
				}
			}
		}
		
		return crunchifyResult;
	}
	
//}
        
        
        
    }
    
//}
