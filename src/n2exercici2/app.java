package n2exercici2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import utilitats.Entrada;

public class app {
	
	private static Set<Restaurant> restaurants = new TreeSet<Restaurant>();

	public static void main(String[] args) {
		boolean sortir = false;
		
		do {
			switch(menu()) {
			case 1:
				afegeixRestaurant();
				break;
			case 2:
				mostraRestaurants();
				break;
			case 0:
				sortir = true;
				System.out.println("App finalitzada.");
				break;
			default:
				System.out.println("Opció invàlida");	
			}	
		}while (!sortir);
		Entrada.close();
	}
	
	private static int menu() {
		final String MENU = "Sel·lecciona una opció:"
				+ "\n1. Introduir restaurant."
				+ "\n2. Mostra tots els restaurants."
				+ "\n0. Sortir";
		return Entrada.llegirInt(MENU);
	}
	
	private static void afegeixRestaurant() {
		Restaurant restaurant = new Restaurant(Entrada.llegirString("Indica el nom del restaurant: "),
				Entrada.llegirInt("Indica la puntuació: "));
		System.out.println(restaurants.add(restaurant) ? "Restaurant afegit correctament" : "Restaurant duplicat");
	}
	
	private static void mostraRestaurants() {
		if (restaurants.isEmpty()) {
			System.out.println("Ho hi ha informació a mostrar");
		}else {
			for (Iterator<Restaurant> iter = restaurants.iterator(); iter.hasNext(); ) {
				System.out.println(iter.next());
			}
		}
	}

}
