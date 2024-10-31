package pobj.expr;

/**
 * Cette classe représente une multiplication
 */

public class Mult extends BinOp implements Expression{

	public Mult(Expression left, Expression right) {
		super(left,right);
		
	}
	/**
	 * @return le membre gauche
	 */
	@Override
	public Expression getLeft() {
		return left;
	}
	/**
	 * @return le membre droit
	 */
	@Override
	public Expression getRight() {
		// TODO Auto-generated method stub
		return right;
	}
	/**
	 * @return la chaine de caractère représentant la multiplication
	 */
	@Override
	public String toString() {
		return getLeft() + " * " + getRight();
	}
	/**
	 * @return l'évalution de la multiplication
	 */
	@Override
	public int eval() {
		return left.eval() * right.eval();
	}
	/**
	 * @return le comportement du visiteur sur la multiplication
	 */
	@Override
	public <T> T accept(IVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
