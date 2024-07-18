package n2exercici2;

public class Restaurant implements Comparable<Restaurant>  {
	
	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio){
		this.nom = nom;
		this.puntuacio = puntuacio;
	}
	
	@Override
	public boolean equals(Object o) {
		Restaurant restaurant = (Restaurant) o;
		return this.nom.equalsIgnoreCase(restaurant.nom) && this.puntuacio == restaurant.puntuacio;
	}
	
	@Override
	public int hashCode() {
		return this.nom.toLowerCase().hashCode() + Integer.hashCode(this.puntuacio);
	}
		
	@Override
	public String toString(){
		return String.format("nom: %s, puntuació: %d", this.nom, this.puntuacio);
	}

	@Override
	public int compareTo(Restaurant restaurant) {
		return this.nom.compareToIgnoreCase(restaurant.nom) != 0 ? this.nom.compareToIgnoreCase(restaurant.nom) :
			Integer.compare(restaurant.puntuacio, this.puntuacio);
	}

}
