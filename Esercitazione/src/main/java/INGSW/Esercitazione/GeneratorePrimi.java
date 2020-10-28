package INGSW.Esercitazione;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneratorePrimi {
	
	public static int k=0;
	public static ArrayList<Integer> l;
	public static ArrayList main(String[] args) {
		System.out.println("inserisci un numero cosi genero tutti i numeri primi fino a quel numero");
		
		l = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(k=2; k<n; k++)
		{
			if(genera(k)) 
				l.add(k);
		}
		return l;
		
	}
	
	public static boolean genera(int n) {
		
		if(n==2)
			return true;
			
		if(n%2 == 0)
			return false;
			
		int divisore = 3;
		while(divisore <= Math.sqrt(n))
		{
			if(n%divisore == 0)
				return false; 
			divisore += 2; 
		}
		return true; 	
	}
	
	
}
