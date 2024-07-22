package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		List<Month> months = new ArrayList<Month>();
		months.add(new Month("January"));
		months.add(new Month("February"));
		months.add(new Month("March"));
		months.add(new Month("April"));
		months.add(new Month("May"));
		months.add(new Month("June"));
		months.add(new Month("July"));
		months.add(new Month("September"));
		months.add(new Month("October"));
		months.add(new Month("November"));
		months.add(new Month("December"));
	
		System.out.println(months);
	
		months.add(7,new Month("August"));
		System.out.println("for-each:");
		for (Month month : months) {
			System.out.println(month);
		}
		System.out.println("\nIterator:");
		for(Iterator<Month> it = months.iterator() ; it.hasNext() ; ) {
			System.out.println(it.next());
		}
		
		Set<Month> monthsSet = new HashSet<>(months);
		
		Month mes13 = new Month("January");
		System.out.println("\nmes13 és un igual a months.get(0): " + mes13.equals(months.get(0)));
		
		System.out.print("el set té emmagatzemats " + monthsSet.size());
		monthsSet.add(mes13);
		System.out.println(" elements i desprès d'afegir un duplicat segueix tenint " + monthsSet.size() + " elements");
		

		

	}

}
