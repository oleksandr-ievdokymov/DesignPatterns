package com.designpatterns.behavioural.templatemethod;

public class JavaCode extends CodeBuilder {

    @Override
    public void lexicalAnalyze() {
        System.out.println("Lexical analyze of Java code");
    }

    @Override
    public void syntaxAnalyze() {
        System.out.println("Syntax analyze of Java code");
    }

    @Override
    public void semanticAnalyze() {
        System.out.println("Semantic analyze of Java code");
    }

    @Override
    public void translateToMachineCode() {
        System.out.println("Translate Java code to Java byte code");
    }
}
