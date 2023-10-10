import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Impl Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	implLexer lex = new implLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	implParser parser = new implParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	String result=interpreter.visit(parseTree);
	System.out.println("The result is: "+result);

	html htmlFile = new html();
	htmlFile.create();
	}
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<String> implements implVisitor<String> {
    // todo - Java will complain that "Interpreter" does not in fact
    // implement "implVisitor" at the moment.

    public String visitStart(implParser.StartContext ctx){
	System.out.println("Evaluating Start");
	System.out.println(ctx.methods().size());

		for (ParseTree child : ctx.children) {
			System.out.println("Child: " + child.getText());
			visit(child);
		}
	return "ok";
    }

	@Override
	public String visitMethods(implParser.MethodsContext ctx) {
		return visit(ctx.getChild(0));
	}


	public String visitHardware(implParser.HardwareContext ctx) {
	String hardware_name = ctx.v.getText();

	System.out.println(hardware_name);

		html htmlFile = new html();
		htmlFile.write("<h1> " + hardware_name + " </h1>\n\n");

		return null;
    }

	@Override
	public String visitInput(implParser.InputContext ctx) {
		for (ParseTree child : ctx.children) {
			visit(child);
		}
		return null;
	}

	@Override
	public String visitOutput(implParser.OutputContext ctx) {
		for (ParseTree child : ctx.children) {
			visit(child);
		}
		return null;
	}

	@Override
	public String visitLatches(implParser.LatchesContext ctx) {
		for (ParseTree child : ctx.children) {
			visit(child);
		}
		return null;
	}

	@Override
	public String visitSimulate(implParser.SimulateContext ctx) {
		for (ParseTree child : ctx.children) {
			visit(child);
		}
		return null;
	}

	@Override
	public String visitUpdates(implParser.UpdatesContext ctx) {
		for (ParseTree child : ctx.children) {
			visit(child);
		}
		System.out.print("\n");
		return null;
	}

	@Override
	public String visitList(implParser.ListContext ctx) {
		for (ParseTree child : ctx.children) {
			System.out.println(child.getText());
		}
		return null;
	}

	@Override
	public String visitLatch(implParser.LatchContext ctx) {
		System.out.println(ctx.v1.getText() + " -> " + ctx.v2.getText());
		return null;
	}

	@Override
	public String visitSimulation(implParser.SimulationContext ctx) {
		System.out.println(ctx.v.getText() + "=" + ctx.i.getText());
		html htmlFile = new html();
		htmlFile.write(
				"<h2> Simulation inputs </h2>\n" +
							"<b> " + ctx.v.getText() + " </b>: " + ctx.i.getText() + "\n\n"
		);
		return null;
	}

	@Override
	public String visitUpdate(implParser.UpdateContext ctx) {
		System.out.print(ctx.v.getText() + " = ");
		visit(ctx.e);
		System.out.print("\n");
		return null;
	}

	@Override
	public String visitOR(implParser.ORContext ctx) {
		visit(ctx.e1);
		System.out.print(ctx.op.getText());
		visit(ctx.e2);
		return null;
	}

	@Override
	public String visitVar(implParser.VarContext ctx) {
		if (ctx.not != null) {
			System.out.print(ctx.not.getText() + ctx.x.getText());
		} else {
			System.out.print(ctx.x.getText());
		}
		return null;
	}

	@Override
	public String visitAND(implParser.ANDContext ctx) {
		visit(ctx.e1);
		System.out.print(ctx.op.getText());
		visit(ctx.e2);
		return null;
	}

	@Override
	public String visitParen(implParser.ParenContext ctx) {
		System.out.print("(");
		visit(ctx.e);
		System.out.print(")");
		return null;
	}

	;
};