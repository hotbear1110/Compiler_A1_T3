// Generated from impl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(implParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(implParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(implParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(implParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(implParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(implParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(implParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(implParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(implParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(implParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(implParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(implParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(implParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(implParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(implParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(implParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(implParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(implParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simulation}.
	 * @param ctx the parse tree
	 */
	void enterSimulation(implParser.SimulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simulation}.
	 * @param ctx the parse tree
	 */
	void exitSimulation(implParser.SimulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(implParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(implParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOR(implParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOR(implParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(implParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(implParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAND(implParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAND(implParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(implParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link implParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(implParser.ParenContext ctx);
}