parser grammar SqlParser;

@header {
package org.joo.libra.sql.antlr;
}

options { tokenVocab=SqlLexer; }

predicate : expression	#expressionExpr
			;

expression : left=expression AND right=expression			#andExpr
     		| left=expression OR right=expression			#orExpr
     		| NOT inner=expression							#notExpr
     		| term											#termExpr
     		;

term : left=factor op=GREATER_THAN right=factor				#compareExpr
       | left=factor op=GREATER_THAN_EQUALS right=factor	#compareExpr
       | left=factor op=LESS_THAN right=factor				#compareExpr
       | left=factor op=LESS_THAN_EQUALS right=factor		#compareExpr
       | left=factor op=EQUALS right=factor					#equalExpr
       | left=factor op=DBL_EQUALS right=factor				#equalExpr
       | left=factor op=NOT_EQUALS right=factor				#notEqualExpr
       | left=factor op=IS_EQUALS NOT right=factor			#notEqualExpr
       | left=factor op=IS_EQUALS right=factor				#equalExpr
       | left=factor op=CONTAINS right=factor				#containsExpr
       | left=factor op=MATCHES right=factor				#matchesExpr
       | factor												#factorExpr
       ;

factor : DOUBLE										#numberExpr
	   | INTEGER									#numberExpr
       | STRING										#stringExpr
       | TRUE										#booleanExpr
       | FALSE										#booleanExpr
       | UNDEFINED									#nullExpr
       | NULL										#nullExpr
       | EMPTY										#emptyExpr
       | VARIABLE									#variableExpr
       | LPAREN expression RPAREN					#parenExpr
       | left=factor op=TIMES right=factor						#mathExpr
       | left=factor op=DIVIDE right=factor						#mathExpr
       | left=factor op=PLUS right=factor						#mathExpr
       | left=factor op=MINUS right=factor						#mathExpr
       ;