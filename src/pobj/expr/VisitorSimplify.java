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
		if (Question10.isConstant(e)) {
			
			Expression c = new Constant(Question10.evalConstantExpression(e));
			return c;
		}
			if(Question10.isConstant(l) && Question10.evalConstantExpression(l) == 0) {
				return r;
			}
			if(Question10.isConstant(r) && Question10.evalConstantExpression(r) == 0) {
				return l;
			}
	
		

		return e;

		
	}
	

	@Override
	public Expression visit(Mult e) {
		// TODO Auto-generated method stub
		Expression l = e.getLeft().accept(this);
		Expression r = e.getRight().accept(this);
		if (Question10.isConstant(e)) {
			
			Expression c = new Constant(Question10.evalConstantExpression(e));
			return c;
		}
			if ((Question10.isConstant(l) && Question10.evalConstantExpression(l) == 0)) { //0*e 
				return new Constant();
			}
			if((Question10.isConstant(r) && Question10.evalConstantExpression(r) == 0)) {///e*0
				return new Constant();
			}
			if ((Question10.isConstant(l) && Question10.evalConstantExpression(l) == 1)) { //1*e 
				return r;
			}
			if(Question10.isConstant(r) && Question10.evalConstantExpression(r) == 1) {//e*1
				return l;
			}
		
		
		return e;
		
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		return v;
	}

}
