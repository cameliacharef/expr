package pobj.expr;

public class VisitorDerive implements IVisitor<Expression> {
	private Var v;
	public VisitorDerive(Var v) {
		this.v = v;
	}
	@Override
	public Expression visit(Constant c) {
		// TODO Auto-generated method stub
		return new Constant(0);
	}

	@Override
	public Expression visit(Add e) {
		// TODO Auto-generated method stub
		Expression l = e.getLeft().accept(this);
		Expression r = e.getRight().accept(this);
		
		
		return new Add(l,r);
	}

	@Override
	public Expression visit(Mult e) {
		// TODO Auto-generated method stub
		Expression l = e.getLeft().accept(this);
		Expression r = e.getRight().accept(this);
		return new Add(new Mult(e.getLeft(),r) ,new Mult(e.getRight(),l));
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		return this.v.equals(v) ? new Constant(1) : new Constant(0);
	}

}
