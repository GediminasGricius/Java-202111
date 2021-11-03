package failai.trecia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("trecia.txt"));
		
		int count=0;
		int suma=0;
		while (in.hasNextInt()) {
			int x=in.nextInt();
			count++;
			suma+=x;
			System.out.println(x);
		}
		
		//double vidurkis=  Math.round( (double)suma   /  count *100)/100.0 ;
		double vidurkis=   (double)suma   /  count ;
		
		//System.out.println("Vidurkis: " + vidurkis);
		System.out.printf("Vidurkis: %8.3f", vidurkis);

	}

}
