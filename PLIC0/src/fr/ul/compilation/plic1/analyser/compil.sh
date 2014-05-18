#!/bin/bash
java -cp ../../../../../../lib/JFlex.jar JFlex.Main AnalyseurLexical.jflex
java -cp ../../../../../../lib/java-cup-11a.jar java_cup.Main -parser AnalyseurSyntaxique -symbols CodesLexicaux Grammaire.cup
exit 0
