package exercises;

import java.util.ArrayList;
import java.util.Random;

public class Playlist {

	public static void main(String[] args) {
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

		desertIslandPlaylist.add("Kill V. Maim");
		desertIslandPlaylist.add("stevie");
		desertIslandPlaylist.add("Echoes");
		desertIslandPlaylist.add("Legs");
		desertIslandPlaylist.add("While My Guitar Gently Weeps");
		desertIslandPlaylist.add("Good 4 U");

		System.out.println(desertIslandPlaylist);
		System.out.println("This playlist contains " + desertIslandPlaylist.size() + " songs.");
		// desertIslandPlaylist.remove("Good 4 U");

		// System.out.println("This playlist contains " + desertIslandPlaylist.size() +
		// " songs.");
//CODEACADEMY EXERCISE
//		int a = desertIslandPlaylist.indexOf("While My Guitar Gentrly Weeps");
//		int b = desertIslandPlaylist.indexOf("stevie");
//
//		String sa = desertIslandPlaylist.get(a);
//		String sw = desertIslandPlaylist.get(b);
//
//		desertIslandPlaylist.set(b, sa);
//		desertIslandPlaylist.set(a, sw);
//
//		System.out.println(desertIslandPlaylist);
//RANDOM BY MEH
//		Random rand = new Random();
//		for (int i = 0; i < desertIslandPlaylist.size(); i++) {
//			int upperbound = desertIslandPlaylist.size();
//
//			int randomNumber = rand.nextInt(upperbound);
//			int randomNumber2 = rand.nextInt(upperbound);
//			//System.out.println(randomNumber);
//			//System.out.println(randomNumber2);
//			String sa1 = desertIslandPlaylist.get(randomNumber);
//			String sb1 = desertIslandPlaylist.get(randomNumber2);
//			
//			int indsa1 = desertIslandPlaylist.indexOf(sa1);
//			int indsb1 = desertIslandPlaylist.indexOf(sb1);
//			
//			desertIslandPlaylist.set(indsa1, sb1);
//			desertIslandPlaylist.set(indsb1, sa1);
//			
//			//System.out.println(indsa1);
//			//System.out.println(indsa1);
//			//System.out.println(sa1);
//			//System.out.println(sb1);
//			System.out.println(desertIslandPlaylist.get(indsa1));
//			System.out.println(desertIslandPlaylist.get(indsb1));
//		}
		
		System.out.println(randomizer(desertIslandPlaylist));
		
		//System.out.println(desertIslandPlaylist);
		

	}
	//RANDOM BUT IS A METHOD =P
	
	public static ArrayList<String> randomizer(ArrayList<String> playlist) {
		Random rand = new Random();
		for (int i = 0; i < playlist.size(); i++) {
			int upperbound = playlist.size();

			int randomNumber = rand.nextInt(upperbound);
			int randomNumber2 = rand.nextInt(upperbound);
			String sa1 = playlist.get(randomNumber);
			String sb1 = playlist.get(randomNumber2);
			
			int indsa1 = playlist.indexOf(sa1);
			int indsb1 = playlist.indexOf(sb1);
			
			playlist.set(indsa1, sb1);
			playlist.set(indsb1, sa1);
	
	}
		return(playlist);
	}
	
}