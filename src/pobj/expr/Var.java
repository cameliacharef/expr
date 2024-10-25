package pobj.expr;

public class Var implements Expression{
	private final String name;
	
	public Var(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Var)) return false;
		Var c = (Var)o;
		return c.name.equals(name);
		
	}

	@Override
	public int eval() {
		throw new UnsupportedOperationException();
	}
}
