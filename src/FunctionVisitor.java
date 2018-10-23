import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FunctionVisitor extends Verbose2BaseVisitor<Value> {

  private HashMap<String, Function> functions;

  public FunctionVisitor (HashMap<String, Function> functions) {
      this.functions = functions;
  }

  @Override public Value visitFunctionDef(Verbose2Parser.FunctionDefContext ctx) {
    List<TerminalNode> params = ctx.params() == null ? new ArrayList<TerminalNode>() : ctx.params().CHARS();
    ParseTree block = ctx.retBlock();
    functions.put(ctx.name.getText(), new Function(ctx.name.getText(), params, ctx.retBlock()));
    return Value.VOID;
  }
}
