// Generated from impl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(implParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(implParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(implParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(implParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(implParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(implParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#updates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(implParser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(implParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(implParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulation(implParser.SimulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(implParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(implParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(implParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(implParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(implParser.ParenContext ctx);
}