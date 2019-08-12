package com.designpatterns.behavioural.templatemethod;

public class CSharpCode extends CodeBuilder {

    @Override
    public void lexicalAnalyze() {
        System.out.println("Lexical analyze of C# code");
    }

    @Override
    public void syntaxAnalyze() {
        System.out.println("Syntax analyze of C# code");
    }

    @Override
    public void semanticAnalyze() {
        System.out.println("Semantic analyze of C# code");
    }

    @Override
    public void translateToMachineCode() {
        System.out.println("Translate C# code to machine code");
    }
}
