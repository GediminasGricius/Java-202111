package failai.pirma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner( new File("ivedimas.txt") );
		
		int      n=in.nextInt();
		boolean  neigiama=false;
		for( int i=0 ; i<n ; i++ ) {
			int x=in.nextInt();
			if (x<0) {
				neigiama=true;
				break;
			}
		}
		
		if (neigiama) {
			System.out.println("Taip");
		}else {
			System.out.println("Ne");
		}
			
		System.out.println("Programa baigia darbą");
	}
}
