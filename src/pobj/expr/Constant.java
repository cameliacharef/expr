package pobj.expr;

public class Constant implements Expression{
	private int val;
	
	public Constant (int value) {
		val = value;
	}
	
	public Constant() {
		val = 0;
		
	}
	
	public int getValue() {
		return val;
	}
	
	public String toString() {
		return ""+val;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if(!(o instanceof Constant)) return false;
		Constant c = (Constant)o;
		return c.val == val;
	}
	@Override
	public int eval() {
		return val;
	}
}
