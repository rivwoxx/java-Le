package exercises;

public class DNA {
	 
	  public static void main(String[] args) {
	    
	    String dna1 = "ATGCGATACGCTTGA";
	    String dna2 = "ATGCGATACGTGA";
	    String dna3 = "ATTAATATGTACTGA";

	    String dna = dna3;
	    System.out.println(dna.length());

	    int atg = dna.indexOf("ATG");
	    int tga = dna.indexOf("TGA");

	    System.out.println(dna.indexOf("ATG"));
	    System.out.println(dna.indexOf("TGA"));

	    if(atg == 0 && tga == 12 && (tga - atg) % 3 == 0){
	      System.out.println("There is a protein");
	      String protein = dna.substring(atg,tga);
	    }else{
	      System.out.println("There is NOT a protein");
	    }

	  }
	 
	}