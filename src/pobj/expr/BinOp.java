package pobj.expr;
/**
 * Cette classe représente une opération binaire
 */
public abstract class BinOp {
	/**
	 * memebre gauche
	 */
	protected final Expression left ;
	/**
	 * membre droit
	 */
	protected final Expression right;
	public BinOp(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	/**
	 * Accesseur du membre gauche
	 * @return le membre gauche
	 */
	public abstract Expression getLeft();
	/**
	 * Accesseur du membre droit
	 * @return le membre droit
	 */
	public abstract Expression getRight();
}
