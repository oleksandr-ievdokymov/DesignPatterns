package com.designpatterns.behavioural.templatemethod;

public abstract class CodeBuilder {

    public final void run() {
        this.lexicalAnalyze();
        this.syntaxAnalyze();
        this.semanticAnalyze();
        this.translateToMachineCode();
    }

    public abstract void lexicalAnalyze();

    public abstract void syntaxAnalyze();

    public abstract void semanticAnalyze();

    public abstract void translateToMachineCode();
}
