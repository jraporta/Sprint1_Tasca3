package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
		
		List<Integer> numbersReverse = new ArrayList<Integer>();
		
		
		
		for(ListIterator<Integer> it = numbers.listIterator(); it.hasNext(); ) {
			numbersReverse.add(0, it.next());
		}
		
		System.out.println(numbersReverse);

	}

}
