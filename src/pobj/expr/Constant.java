package pobj.expr;

/**
 * Cette classe représente uen constante
 */

public class Constant implements Expression{
	/** valeur de la constante*/
	private int val;
	
	public Constant (int value) {
		val = value;
	}
	/**
	 * valeur fixée à 0 par défaut
	 */
	public Constant() {
		val = 0;
		
	}
	/**
	 * Accesseur de la valeur
	 * @return la valeur de la constante
	 */
	public int getValue() {
		return val;
	}
	/**
	 * @return la chaine de caractère de la constante
	 */
	@Override
	public String toString() {
		return ""+val;
	}
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if(!(o instanceof Constant)) return false;
		Constant c = (Constant)o;
		return c.val == val;
	}
	/**
	 * Evalue la constante
	 * @return la constante
	 */
	@Override
	public int eval() {
		return val;
	}
	/**
	 * @return le comportement du visiteur sur la constante
	 */
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
