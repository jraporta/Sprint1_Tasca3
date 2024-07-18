package n1exercici1;

public class Month {
	
	private String name;
	
	public Month(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		Month month = (Month) o;
		return this.name.equalsIgnoreCase(month.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
