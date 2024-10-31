package pobj.expr;
/**
 * Cette interface décrit le comportement d'une expression
 */
public interface Expression {
	/**
	 * @return l'évaluation de l'expression
	 */
   public int eval();
   /**
	 * @return le comportement du visiteur sur l'expression
	 */
   public <T> T accept(IVisitor<T> visitor);
}
