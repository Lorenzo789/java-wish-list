package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/*
	 Creare una classe Main con metodo main, in cui
	 implementare il seguente programma: creare una nuova ArrayList dove salvare la lista dei desideri
	 continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi
	 Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare.
	 Ad ogni iterazione aggiungere il desiderio alla lista.
	 Al termine dell’inserimento ordinare la lista e stampare a video la lista ordinata.
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> wishList = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
	
		boolean hasContinued = false;
		
		System.out.print("You wanna add something to the wishlist? y/n ");
		String continued = sc.nextLine();
		
		if (continued.equals("y")) {
			
			hasContinued = true;
			
			while(hasContinued) {
				
				System.out.print("Insert a new wish for your wishlist ");
				String newWish = sc.nextLine();
				
				wishList.add(newWish);
				System.out.println("Your WishList contain: " + wishList.size() + " element");
				
				System.out.print("You wanna add something to the wishlist? y/n ");
				String continueAdd = sc.nextLine();
				
				if(continueAdd.equals("n")) {
					hasContinued = false;
				}
				
			}
			
		} else if(continued.equals("n")) {
			
			hasContinued = false;
			
		}
		
		wishList.iter
		
	}
	
}