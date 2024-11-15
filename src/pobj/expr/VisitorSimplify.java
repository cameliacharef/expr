package pobj.expr;

public class VisitorSimplify implements IVisitor<Expression>{

	@Override
	public Expression visit(Constant c) {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Expression visit(Add e) {
		Expression l = e.getLeft().accept(this);
		Expression r = e.getRight().accept(this);

			if(Question10.isConstant(l) && Question10.isConstant(r)) {
				 return new Constant(e.eval());
			}
			if ((Question10.isConstant(l) && ((Constant) l).getValue() == 0) ) { //0+e 
				return r;
			}
			if((Question10.isConstant(r) && ((Constant) r).getValue() == 0)) { //e+0
				return l;
			}
	
		

		return new Add (l,r);
	}

	@Override
	public Expression visit(Mult e) {
		// TODO Auto-generated method stub
		Expression l = e.getLeft().accept(this);
		Expression r = e.getRight().accept(this);
			if(Question10.isConstant(l) && Question10.isConstant(r)) {
		         return new Constant(e.eval());
			}
			if ((Question10.isConstant(l) && ((Constant) l).getValue() == 0)) { //0*e 
				return new Constant(0);
			}
			if((Question10.isConstant(r) && ((Constant) r).getValue() == 0)) {///e*0
				return new Constant(0);
			}
			if ((Question10.isConstant(l) && ((Constant) l).getValue() == 1)) { //1*e 
				return r;
			}
			if(Question10.isConstant(r) && ((Constant) r).getValue() == 1) {//e*1
				return l;
			}
		
		
		return new Mult(l, r);
		
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		return v;
	}

}
