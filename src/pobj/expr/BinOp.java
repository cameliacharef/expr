package pobj.expr;

public abstract class BinOp {
	protected final Expression left ;
	protected final Expression right;
	public BinOp(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	public abstract Expression getLeft();
	public abstract Expression getRight();
}
