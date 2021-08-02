package exercises;

import java.util.ArrayList;

public class DNA {
	 
	  public static void main(String[] args) {
	    
		ArrayList<String> dnas = new ArrayList<String>();
		  
	    dnas.add("ATGCGATACGCTTGA"); 
	    dnas.add("ATGCGATACGTGA");
	    dnas.add("ATTAATATGTACTGA");
	    dnas.add("ATGCGATACGCTTGA");

	    //String dna = dna3;
	    //System.out.println(dna.length());

//	    int atg = dna.indexOf("ATG");
//	    int tga = dna.indexOf("TGA");
//
//	    System.out.println(dna.indexOf("ATG"));
//	    System.out.println(dna.indexOf("TGA"));
//
//	    if(atg == 0 && tga == 12 && (tga - atg) % 3 == 0){
//	      System.out.println("There is a protein");
//	      String protein = dna.substring(atg,tga);
//	    }else{
//	      System.out.println("There is NOT a protein");
//	    }
	    
	    for(int i = 0; i < dnas.size(); i++) {
	    	String dna = dnas.get(i);
	    	
	    	int atg = dna.indexOf("ATG");
	    	int tga = dna.indexOf("TGA");
	    	
	    	if(atg == 0 && tga == 12 && (tga - atg) % 3 == 0){
	  	      System.out.println("There is a protein");
	  	      String protein = dna.substring(atg,tga);
	  	      System.out.println(protein);
	  	    }else{
	  	      System.out.println("There is NOT a protein");
	  	    }
	    }

	  }
	 
	}