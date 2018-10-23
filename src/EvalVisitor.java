import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class EvalVisitor extends Verbose2BaseVisitor<Value> {

  private HashMap<String, Value> memory;
  private HashMap<String, Function> functions;

  public EvalVisitor (HashMap<String, Value> scope, HashMap<String, Function> functions) {
      this.functions = functions;
      this.memory = scope;
  }

  @Override public Value visitProgram(Verbose2Parser.ProgramContext ctx) {
    visitChildren(ctx);
    Value value = visit(ctx.ret);
    System.out.println(value);
    return value;
  }

  @Override public Value visitRetBlock(Verbose2Parser.RetBlockContext ctx) {
    visit(ctx.block());
    return visit(ctx.ret);
  }

  @Override public Value visitFunctionDef(Verbose2Parser.FunctionDefContext ctx) { return Value.VOID; }

  @Override public Value visitFunctionCall(Verbose2Parser.FunctionCallContext ctx) {
    String name = ctx.name.getText();
    List<Verbose2Parser.ComparisonExpressionContext> params = ctx.expressionList() == null ? new ArrayList<Verbose2Parser.ComparisonExpressionContext>() : ctx.exprList.comparisonExpression();
    Function f = functions.get(name);
    Value v;
    if(f != null) {
      v =  f.eval(params, functions, memory);
    }  else { throw new RuntimeException("No such defined function " + name); }
    return v;
  }

  @Override public Value visitParams(Verbose2Parser.ParamsContext ctx) { return visitChildren(ctx); }

  @Override public Value visitReturnStatement(Verbose2Parser.ReturnStatementContext ctx) {
    return visit(ctx.expr);
  }

  @Override public Value visitAssignmentStatement(Verbose2Parser.AssignmentStatementContext ctx) {
    String key = ctx.key.getText();
    Value v = visit(ctx.expr);
    memory.put(key,v);
    return visitChildren(ctx);
  }

  @Override public Value visitConditionalStatement(Verbose2Parser.ConditionalStatementContext ctx) {
    Boolean cond = visit(ctx.comp).asBoolean();
    if(cond) {
      return visit(ctx.b1);
    } else {
      return visit(ctx.b2);
    }
  }

  @Override public Value visitCompComp(Verbose2Parser.CompCompContext ctx) {
    String op = ctx.op.getText();
    try {
      int l = visit(ctx.left).asInt();
      int r = visit(ctx.right).asInt();
      switch(op) {
        case "<": return new Value(l < r);
        case ">": return new Value(l > r);
        case "<=": return new Value(l <= r);
        case ">=": return new Value(l >= r);
        case "==": return new Value(l == r);
        case "!=": return new Value(l != r);
        default: throw new RuntimeException("Uknown operator " + op);
      }
    } catch (Exception e) {
      throw new RuntimeException("Right or Left hand side of operator " + op + " is not a number!");
    }
   }

   @Override public Value visitCompNot(Verbose2Parser.CompNotContext ctx) {
     try {
       Boolean b = visit(ctx.expr).asBoolean();
       return new Value(!b);
     } catch (Exception e) {
       throw new RuntimeException("Right hand side of operator ! is not a boolean!");
     }
   }

   @Override public Value visitCompLogical(Verbose2Parser.CompLogicalContext ctx) {
     String op = ctx.op.getText();
     try {
       Boolean l = visit(ctx.left).asBoolean();
       Boolean r = visit(ctx.right).asBoolean();
       switch(op) {
         case "||": return new Value(l || r);
         case "&&": return new Value(l && r);
         default: throw new RuntimeException("Uknown operator " + op);
       }
     } catch (Exception e) {
       throw new RuntimeException("Right or Left hand side of operator " + op + " is not a boolean!");
     }
   }

  @Override public Value visitOpExpr(Verbose2Parser.OpExprContext ctx) {
     Value left = visit(ctx.left);
     Value right = visit(ctx.right);
     String op = ctx.op.getText();
     switch(op.charAt(0)) {
       case '*': return new Value(new Integer(left.asInt() * right.asInt()));
       case '/': return new Value(new Integer(left.asInt() / right.asInt()));
       case '+': return new Value(new Integer(left.asInt() + right.asInt()));
       case '-': return new Value(new Integer(left.asInt() - right.asInt()));
       default: throw new RuntimeException("Uknown operator " + op);
     }
   }

   @Override public Value visitParenExpr(Verbose2Parser.ParenExprContext ctx) {
     return this.visit(ctx.mathExpression());
   }

  @Override public Value visitPrimaryString(Verbose2Parser.PrimaryStringContext ctx) {
    Value v = memory.get(ctx.getText());
        if (v == null)
          throw new RuntimeException("Do not know the value of " + ctx.getText());
    return v;
  }

  @Override public Value visitPrimaryNumber(Verbose2Parser.PrimaryNumberContext ctx) {
    return new Value(Integer.valueOf(ctx.getText()));
  }

  @Override public Value visitPrimaryBoolean(Verbose2Parser.PrimaryBooleanContext ctx) {
    if(ctx.getText().equals("TRUE")) {
      return new Value(true);
    } else
      return new Value(false);
  }
  @Override public Value visitBracketComp(Verbose2Parser.BracketCompContext ctx) { return visit(ctx.expr); }
}
