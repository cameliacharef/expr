package pobj.expr;

/**
 * Cette classe représente une variable
 */
public class Var implements Expression{
	/** nom de la variable */
	private final String name;
	
	public Var(String name) {
		this.name = name;
	}
	/**
	 * @return le nom de la variable
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return la variable
	 */
	@Override
	public String toString() {
		return name;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Var)) return false;
		Var c = (Var)o;
		return c.name.equals(name);
		
	}
	/**
	 * Lève une exception (pour l'insatnt)
	 */
	@Override
	public int eval() {
		throw new UnsupportedOperationException();
	}
	/**
	 * @return le comportement du visiteur sur la variable
	 */
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
