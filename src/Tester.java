import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashMap;

public class Tester {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        Verbose2Lexer lexer = new Verbose2Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Verbose2Parser parser = new Verbose2Parser(tokens);
        ParseTree tree = parser.program();

        HashMap<String, Value> scope = new HashMap<String, Value>();
        HashMap<String, Function> functions = new HashMap<String, Function>();
        FunctionVisitor fvisitor = new FunctionVisitor(functions);
        fvisitor.visit(tree);
        EvalVisitor visitor = new EvalVisitor(scope, functions);
        visitor.visit(tree);
        
        System.out.println(tree.toStringTree(parser));
    }
}
