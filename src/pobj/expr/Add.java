package pobj.expr;

public class Add extends BinOp implements Expression{
	public Add(Expression left, Expression right) {
		super(left,right);
		
	}
	@Override
	public Expression getLeft() {
		return left;
	}

	@Override
	public Expression getRight() {
		return right;
	}
	public String toString() {
		return "( " + getLeft() + " + " + getRight() + " )";
	}
	@Override
	public int eval() {
		return left.eval() + right.eval();
	}
	@Override
	public <T> T accept(IVisitor<T> visiteur) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
