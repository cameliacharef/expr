package pobj.expr;
/**
 * Cette classe représente une addition
 */
public class Add extends BinOp implements Expression{
	public Add(Expression left, Expression right) {
		super(left,right);
		
	}
	/**
	 * @return l'expression du membre gauche de l'addition
	 */
	@Override
	public Expression getLeft() {
		return left;
	}
	/**
	 * @return l'expression du membre droit de l'addition
	 */
	@Override
	public Expression getRight() {
		return right;
	}
	/**
	 * @return la chaine de caractère représentant l'addition
	 */
	@Override
	public String toString() {
		return "( " + getLeft() + " + " + getRight() + " )";
	}
	/**
	 * @return l'évalutation de l'addition
	 */
	@Override
	public int eval() {
		return left.eval() + right.eval();
	}
	/**
	 * @return le comportement du visiteur sur l'addition
	 */
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
