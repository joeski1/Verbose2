grammar Verbose2;

program
	: functionDef* ret=retBlock functionDef*
	;

functionDef
	: 'MY FUNCTION CALLED ' name=CHARS 'TAKES THESE PARAMETERS(' paras=params? ')' '{' retBlock'}'
	;

params
	: (CHARS',')* CHARS
	;

returnStatement
	: 'RETURN ' expr=comparisonExpression ';'
	;

retBlock
	: block ret=returnStatement
	;

block
	: statement*
	;

statement
	: comparisonExpression ';' 	#compStatement
	| 'IF IT HOLDS THAT' '(' comp=comparisonExpression ')' '{' b1=block '}' ('OTHERWISE {' b2=block '}')? #conditionalStatement
	| 'MY VARIABLE CALLED' key=CHARS 'WILL BIND TO THE FOLLOWING VALUE' expr=mathExpression ';'	#assignmentStatement
	;

expressionList
	: comparisonExpression (',' comparisonExpression)*
	;

comparisonExpression
: '(' expr=comparisonExpression ')' #bracketComp
	|	left=mathExpression op=('<' | '>' | '>=' | '<=' | '==' | '!=') right=mathExpression	#compComp
	| left=comparisonExpression op=('||' | '&&') right=comparisonExpression #compLogical
	| '!' expr=comparisonExpression #compNot
	| expr=mathExpression #compMathExpr
	;

mathExpression  : left=mathExpression op=('*'|'/') right=mathExpression #opExpr
	      | left=mathExpression op=('+'|'-') right=mathExpression 				#opExpr
	      | '(' expr=mathExpression ')'                      							#parenExpr
				| name=CHARS '(' exprList=expressionList? ')'										#functionCall
	      | primary                          															#primaryExpr
	      ;

primary
	: ('TRUE' | 'FALSE')	#primaryBoolean
	| CHARS 							#primaryString
	| NUMBER							#primaryNumber
	;
//######################################


NUMBER 	:	'0'..'9'+
	;

CHARS 	:	('a'..'z'| 'A'..'Z')+
	;

COMMENT	:  	 '//' ~('\n'|'\r')* '\r'? '\n' -> skip ;

WS : [ \t\r\n]+ -> skip ;
