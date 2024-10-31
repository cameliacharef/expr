package pobj.expr;

/**
 * Cette classe obéit au Design Pattern Visitor qui évalue des expressions
 */

public class VisitorEval implements IVisitor<Integer> {

	@Override
	public Integer visit(Constant c) {
		return c.getValue();
	}

	@Override
	public Integer visit(Add e) {
		int left = e.getLeft().accept(this);
		int right = e.getRight().accept(this);
		return left + right;
	}

	@Override
	public Integer visit(Mult e) {
		int left = e.getLeft().accept(this);
		int right = e.getRight().accept(this);
		return left * right;
	}
	/**
	 * Lève une excpetion (pour l'instant)
	 */
	@Override
	public Integer visit(Var v) {
		throw new UnsupportedOperationException();
	}

}
