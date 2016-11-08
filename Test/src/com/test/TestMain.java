package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.apache.log4j.Logger;

//import com.cordys.cpc.bsf.busobject.BusObject;
//import com.cordys.cpc.bsf.busobject.BusObjectIterator;
//import com.cordys.cpc.bsf.busobject.QueryObject;

public class TestMain {
	//static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TestMain.class.getName());
public static void main(String[] args) {
	
	//log.error("Some error occured");
	
//	try {
//		File folder = new File("E:\\MIS\\PDF_Archive\\V\\invoice\\2016\\06\\");
//		System.out.println(folder.listFiles());
//		File[] listOfFiles = folder.listFiles();
//		
//		
//		File file = new File("D:\\filenames.txt");
//
//		// if file doesnt exists, then create it
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//
//		FileWriter fw = new FileWriter(file.getAbsoluteFile());
//		BufferedWriter bw = new BufferedWriter(fw);
//		String content="";
//		
//		
//		
//		System.out.println(listOfFiles.length);
//		    for (int i = 0; i < listOfFiles.length; i++) {
//		      if (listOfFiles[i].isFile()) {
//		        System.out.println("File " + listOfFiles[i].getName());
//		        content+=listOfFiles[i].getName()+" \n";
//		      } else if (listOfFiles[i].isDirectory()) {
//		        System.out.println("Directory " + listOfFiles[i].getName());
//		      }
//		    }
//		    
//		    bw.write(content);
//			bw.close();
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
	//getGradeFromPRCodeString("","");
	
}



/*private static boolean checkPRCodeMatch(String prCode1, String prCode2) {
	boolean res=false;
	if(prCode1==null && prCode2==null)
		res =true;
	else if(prCode1.trim().equals(prCode2.trim()))
		res = true;
	else{			
		String prCodes1[] = prCode1.split(" ");
		String prCodes2[] = prCode2.split(" ");			
		if(prCodes1.length == prCodes2.length){
			Set prc2Set=new TreeSet();
			for(int i=0;i<prCodes2.length;i++){
				prc2Set.add(prCodes2[i]);				
			}
			res = true;
			for(int p = 0 ;p<prCodes1.length;p++){
				if(!prc2Set.contains(prCodes1[p])){
					res = false;
					break;
				}
			}


		}
	}
	
	Map<String,String> myGrp = new HashMap<String,String>();
	for (Map.Entry<String, String> entry : hp.entrySet())
	{
		String modelYear = entry.getValue();
		String ref = entry.getKey();
		if(myGrp==null)
			myGrp.put(modelYear, ref);
		else{
			String existingRef = myGrp.get(modelYear);
			if(existingRef==null)
				myGrp.put(modelYear, ref);
			else{
				myGrp.put(modelYear,existingRef+","+ref);					
			}
		}


	}
	
	

	return res;
}*/

public static  String getGradeFromPRCodeString(String modelCode,String modelYear){
	String prCodesString="PNQ PQD PRN WCI WEU  7M8"; 
	List<String> prCodesList = Arrays.asList(prCodesString.split("\\s+")); 
	String gradeCode = null;
	 
	
		
		List<String> prCodesTempList = Arrays.asList("PNQ PQD PRN WCI WEU  7M8".split("\\s+")); 
		String tempGradeCode = "TEC";
		if(prCodesList.containsAll(prCodesTempList) && prCodesTempList.containsAll(prCodesList)){
			gradeCode = tempGradeCode;
			
			System.out.println(gradeCode);
		}
		else{
			System.out.println("2");
		}
	

	return gradeCode;

}
}
