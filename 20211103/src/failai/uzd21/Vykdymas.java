package failai.uzd21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("antra.txt"));
		int n=in.nextInt();
		int min=in.nextInt();
		int max=min;
		for (int i=0; i<n-1; i++) {
			int x=in.nextInt();
			if (min>x) {
				min=x;
			}
			if (max<x) {
				max=x;
			}
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		in.close();
	}

}
