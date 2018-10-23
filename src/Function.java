import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Function {

  private String name;
  private List<TerminalNode> params;
  private ParseTree block;

  public Function(String name, List<TerminalNode> params, ParseTree block) {
    this.name = name;
    this.params = params;
    this.block = block;
  }

  public Value eval(List<Verbose2Parser.ComparisonExpressionContext> params, HashMap<String, Function> functions, HashMap<String, Value> scope) {
    if(params.size() != this.params.size())
      throw new RuntimeException("Incorrect number of arguments calling function " + name);

    HashMap<String, Value> thisScope = new HashMap<String, Value>(scope);
    EvalVisitor visitor = new EvalVisitor(thisScope, functions);
    for(int i = 0; i < params.size(); i++) {
      Value v = visitor.visit(params.get(i));
      thisScope.put(this.params.get(i).getText(), v);
    }

    return visitor.visit(this.block);
  }

}
