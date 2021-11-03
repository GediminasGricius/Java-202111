package failai.antra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("antra.txt"));
		
		int n=in.nextInt();
		
		int kiekis=0;
		int buves=in.nextInt();
		for (int i=0; i<n-1; i++) {
			int x=in.nextInt();
			if (buves>x) {
				kiekis++;
			}
			buves=x;
		}
		System.out.println("Skaiciu mazesniu uz kaimyna is kaires: "+kiekis);
		

	}

}
