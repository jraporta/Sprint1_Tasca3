package n1exercici1;

public class Month {
	
	private String name;
	
	public Month(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean equals = true;
		if (this == o){
			equals = true;
		} else if (o == null){
			equals = false;			
		}else {
			Month month = (Month) o;
			equals = this.name.equalsIgnoreCase(month.name);
		}
		return equals;
	}
	
	@Override
	public int hashCode() {
		return this.name.toLowerCase().hashCode();
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
