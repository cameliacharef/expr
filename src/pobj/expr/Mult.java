package pobj.expr;

public class Mult extends BinOp implements Expression{

	public Mult(Expression left, Expression right) {
		super(left,right);
		
	}
	@Override
	public Expression getLeft() {
		return left;
	}

	@Override
	public Expression getRight() {
		// TODO Auto-generated method stub
		return right;
	}
	public String toString() {
		return getLeft() + " * " + getRight();
	}
	@Override
	public int eval() {
		return left.eval() * right.eval();
	}
}
