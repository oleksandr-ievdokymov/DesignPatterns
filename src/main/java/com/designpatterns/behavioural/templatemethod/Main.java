package com.designpatterns.behavioural.templatemethod;

public class Main {

    public static void main(String[] args) {
        CodeBuilder codeBuilder = new JavaCode();
        codeBuilder.run();

        System.out.println("---------------------------");

        codeBuilder = new CSharpCode();
        codeBuilder.run();
    }
}
