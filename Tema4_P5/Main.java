package Tema4_P5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Main {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduceti dimensiunile imaginii");
		
		int l = Integer.parseInt(x.readLine());
		int w = Integer.parseInt(x.readLine());
		
		
		int[][] picture = new int[l][w];
		
		for(int i=0; i<l; i++) 
			for(int j=0; j<w; j++) {
				picture[i][j] = new Random().nextInt(255);
				
			}
		
		for(int[] row : picture) {
            printRow(row);
        }
		

	}

	public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }


}
